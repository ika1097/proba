import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lista1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        final ObservableList<Integer> lefts= FXCollections.observableArrayList(1,2,3);
        final ListView<Integer> leftListView=new ListView<>(lefts);

        final ObservableList<Integer> rights= FXCollections.observableArrayList(11,22,33);
        final ListView<Integer> rightListView=new ListView<>(rights);

        HBox hbListView=new HBox(leftListView,rightListView);
        hbListView.setSpacing(10);
        hbListView.setPadding(new Insets(10));

        Button btnClick=new Button("Klikni");
        btnClick.setOnAction(e->{
            Integer left=leftListView.getSelectionModel().getSelectedItem();
            Integer right=rightListView.getSelectionModel().getSelectedItem();
            if(left!=null && right!=null){

                // Nacin 1.
                if((right/left)==11){
                    lefts.remove(left);
                    rights.remove(right);
                }

                // Nacin 2.
//                lefts.remove(left);
//                rights.remove(right);
//                lefts.add(right);
//                rights.add(left);

                // Nacin 3.
//                lefts.set(lefts.indexOf(left),right);
//                rights.set(rights.indexOf(right),left);
            }
        });

        VBox vbAll=new VBox(btnClick,hbListView);
        vbAll.setSpacing(10);
        vbAll.setPadding(new Insets(10));

        Group root=new Group();
        root.getChildren().add(vbAll);
        Scene scene=new Scene(root,550,550);
        stage.setTitle("Lista vezba");
        stage.setScene(scene);
        stage.show();
    }
}