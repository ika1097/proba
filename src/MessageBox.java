import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MessageBox {
    public static void show(String message, String title) {
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(250);
        Label lbl=new Label(message);
        Button btnOK=new Button("Ok");
        btnOK.setOnAction(e->stage.close());
        VBox pane=new VBox(20);
        pane.getChildren().addAll(lbl,btnOK);
        pane.setAlignment(Pos.CENTER);
        Scene scene=new Scene(pane);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
