import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FormaZaCrtanje extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label lblX=new Label("X:");
        TextField txtX=new TextField();
        txtX.setPromptText("Unesite x");
        HBox hbX=new HBox(lblX,txtX);
        hbX.setSpacing(10);
        hbX.setPadding(new Insets(10));

        Label lblY=new Label("Y:");
        TextField txtY=new TextField();
        txtY.setPromptText("Unesite y");
        HBox hbY=new HBox(lblY,txtY);
        hbY.setSpacing(10);
        hbY.setPadding(new Insets(10));

        Label lblSize=new Label("Velicina:");
        TextField txtSize=new TextField();
        txtSize.setPromptText("Unesite velicinu");
        HBox hbSize=new HBox(lblSize,txtSize);
        hbSize.setSpacing(10);
        hbSize.setPadding(new Insets(10));

        Circle c=new Circle();
        Button btnPrint=new Button("Crtaj");
        btnPrint.setOnAction(e->{
            c.setCenterX(Integer.parseInt(txtX.getText()));
            c.setCenterY(Integer.parseInt(txtY.getText()));
            c.setRadius(Integer.parseInt(txtSize.getText()));
            c.setFill(Color.RED);
        });

        VBox vbAll=new VBox(hbX,hbY,hbSize,btnPrint);
        vbAll.setSpacing(10);
        vbAll.setPadding(new Insets(10));

        Group root=new Group();
        root.getChildren().addAll(vbAll,c);
        Scene scene=new Scene(root,500,500);
        stage.setTitle("Forma za crtanje");
        stage.setScene(scene);
        stage.show();
    }
}
