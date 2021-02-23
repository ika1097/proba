import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Krugovi extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    int counter=0;
    ArrayList<Circle> c=new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {
        Group root=new Group();
        Button btnDodaj=new Button("Dodaj krugove");

        btnDodaj.setOnAction(e->{
            if(counter==0){
                c.add(new Circle(400,400,60,Color.BLACK));
                root.getChildren().add(c.get(0));
                counter++;
            }else if(counter==1){
                c.add(new Circle(400,310,40,Color.BLACK));
                c.add(new Circle(310,400,40,Color.BLACK));
                c.add(new Circle(490,400,40,Color.BLACK));
                root.getChildren().addAll(c.get(1),c.get(2),c.get(3));
                counter++;
            }
            else{
                c.add(new Circle(400,250,20,Color.BLACK));
                c.add(new Circle(350,300,20,Color.BLACK));
                c.add(new Circle(450,300,20,Color.BLACK));
                root.getChildren().addAll(c.get(4),c.get(5),c.get(6));
            }

        });

        root.getChildren().add(btnDodaj);

        Scene scene=new Scene(root,800,800);
        stage.setTitle("Krugovi");
        stage.setScene(scene);
        stage.show();
    }
}