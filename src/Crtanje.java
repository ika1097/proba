import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Crtanje extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene=new Scene(root,200,250, Color.WHITE);
        Circle c=new Circle();
        c.setCenterX(100.0);
        c.setCenterY(100.0);
        c.setRadius(50.0);
        c.setFill(Color.RED);
        c.setCache(true);
        root.getChildren().add(c);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
