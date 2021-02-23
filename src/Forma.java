import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Forma extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblUserName=new Label("Korisnicko ime:");
        TextField txtUserName=new TextField();
        txtUserName.setPromptText("Unesite korisnicko ime");
        HBox hbUserName=new HBox(lblUserName,txtUserName);
        hbUserName.setSpacing(10);

        Label lblPassword=new Label("Password:");
        PasswordField pfPassword=new PasswordField();
        pfPassword.setPromptText("Unesite sifru");
        HBox hbPassword=new HBox(lblPassword,pfPassword);
        hbPassword.setSpacing(10);

        Label lblGender=new Label("Pol:");
        RadioButton rbMale=new RadioButton("Muski");
        RadioButton rbFemale=new RadioButton("Zenski");
        ToggleGroup tgGender=new ToggleGroup();
        rbMale.setToggleGroup(tgGender);
        rbFemale.setToggleGroup(tgGender);
        VBox vbGender=new VBox(rbMale,rbFemale);
        vbGender.setSpacing(10);
        HBox hbGender=new HBox(lblGender,vbGender);
        hbGender.setSpacing(10);

        Label lblLang=new Label("Jezik:");
        CheckBox cbEng=new CheckBox("Engleski");
        CheckBox cbDe=new CheckBox("Nemacki");
        CheckBox cbFr=new CheckBox("Francuski");
        HBox hbLang=new HBox(lblLang,cbEng,cbDe,cbFr);
        hbLang.setSpacing(10);

        Circle c=new Circle();
        Button btnCrtaj=new Button("Crtaj");
        btnCrtaj.setOnAction(e->{
            c.setCenterY(250.0);
            c.setCenterX(250.0);
            c.setRadius(50.0);
            c.setFill(Color.RED);
        });

        VBox vbAll=new VBox(hbUserName,hbPassword,hbGender,hbLang,btnCrtaj,c);
        vbAll.setSpacing(10);
        vbAll.setPadding(new Insets(10));

        Group root=new Group();
        root.getChildren().addAll(vbAll);
        primaryStage.setTitle("Forma");
        primaryStage.setScene(new Scene(root,500,530));
        primaryStage.show();
    }
}