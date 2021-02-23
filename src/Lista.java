import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Lista extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lista");
        Group root=new Group();
        Scene scene=new Scene(root,400,250, Color.WHITE);

        Button btnClick=new Button("Dugme");


        HBox hb=new HBox();
        hb.setPadding(new Insets(10,10,10,170));
        hb.setSpacing(10);
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(btnClick);

        final ObservableList<Integer> lefts= FXCollections.observableArrayList(1,2,3);
        final ListView<Integer> leftListView=new ListView<>(lefts);
        leftListView.setPrefHeight(150);
        leftListView.setPrefWidth(150);

        final ObservableList<Integer> rights=FXCollections.observableArrayList(11,22,33);
        final ListView<Integer> rightListView=new ListView<>(rights);
        rightListView.setPrefHeight(150);
        rightListView.setPrefWidth(150);

        HBox hb1=new HBox();
        hb1.setPadding(new Insets(10));
        hb1.setSpacing(10);
        hb1.getChildren().addAll(leftListView,rightListView);

        btnClick.setOnAction(e->{
            Integer left=leftListView.getSelectionModel().getSelectedItem();
            Integer right=rightListView.getSelectionModel().getSelectedItem();
//            if((right/left)==11){
//                lefts.remove(left);
//                rights.remove(right);
//            }
//            if(left!=null && right!=null){
//                lefts.remove(left);
//                rights.remove(right);
//                lefts.add(right);
//                rights.add(left);
//            }
            if(left!=null && right!=null){
                lefts.set(lefts.indexOf(left),right);
                rights.set(rights.indexOf(right),left);
            }
        });

        VBox vb=new VBox();
        vb.getChildren().addAll(hb,hb1);

        root.getChildren().add(vb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}