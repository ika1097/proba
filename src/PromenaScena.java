import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class PromenaScena extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    int iClickCount=0;
    Label lblClicks;
    Button btnClickMe;
    Button btnSwitchToScene2;
    Scene scene1;

    int iCounter=0;
    Label lblCounter;
    Button btnAdd;
    Button btnSubstract;
    Button btnSwitchToScene1;
    Scene scene2;

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;

        lblClicks=new Label();
        lblClicks.setText("You have not clicked the button.");
        btnClickMe=new Button();
        btnClickMe.setText("Please, click me!");
        btnClickMe.setOnAction(e->btnClickMe_click());
        btnSwitchToScene2=new Button();
        btnSwitchToScene2.setText("Switch!");
        btnSwitchToScene2.setOnAction(e->btnSwitchToScene2_Click());
        VBox pane1=new VBox(10);
        pane1.getChildren().addAll(lblClicks,btnClickMe,btnSwitchToScene2);
        scene1=new Scene(pane1,250,150);

        lblCounter=new Label();
        lblCounter.setText(Integer.toString(iCounter));
        btnAdd=new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(e->btnAdd_click());
        btnSubstract=new Button();
        btnSubstract.setText("Substract");
        btnSubstract.setOnAction(e->btnSubstract_click());
        btnSwitchToScene1=new Button();
        btnSwitchToScene1.setText("Switch!");
        btnSwitchToScene1.setOnAction(e->btnSwitchToScene1_Click());
        HBox pane2=new HBox(10);
        pane2.getChildren().addAll(lblCounter,btnAdd,btnSubstract,btnSwitchToScene1);
        scene2=new Scene(pane2,300,75);

        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene Switcher");
        primaryStage.show();
    }

    private void btnSwitchToScene1_Click() {
        stage.setScene(scene1);
    }

    private void btnSubstract_click() {
        iCounter--;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnAdd_click() {
        iCounter++;
        lblCounter.setText(Integer.toString(iCounter));
    }

    private void btnSwitchToScene2_Click() {
        stage.setScene(scene2);
    }

    private void btnClickMe_click() {
        iClickCount++;
        if(iClickCount==1){
            lblClicks.setText("You have clicked once");
        }else{
            lblClicks.setText("You have clicked " + iClickCount + " times.");
        }
    }
}
