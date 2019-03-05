package inleveropdrachten.opdracht8a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class BoekingenApp extends Application{
    public void start(Stage primaryStage) {
        Label label = new Label("Voer uw gegevens in!");
        Label naam = new Label("naam:");
        TextField naamInput = new TextField();
        Label adres = new Label("adres:");
        TextField adresInput = new TextField();
        Label aankomstdatum = new Label("aankomstdatum:");
        DatePicker aankomstdatumInput = new DatePicker();
        Label vertrekdatum = new Label("vertrekdatum:");
        DatePicker vertrekdatumInput = new DatePicker();
        Label kamertype = new Label("kamertype:");
        ComboBox kamertypeInput = new ComboBox();

        Button resetBtn = new Button();
        resetBtn.setText("Reset");
        Button boekBtn = new Button();
        boekBtn.setText("boek");
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(resetBtn, boekBtn);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);

        label.setPrefWidth(250);
        naam.setPrefWidth(100);
        adres.setPrefWidth(100);
        aankomstdatum.setPrefWidth(100);
        vertrekdatum.setPrefWidth(100);
        kamertype.setPrefWidth(100);
        naamInput.setPrefWidth(210);
        adresInput.setPrefWidth(210);
        aankomstdatumInput.setPrefWidth(210);
        vertrekdatumInput.setPrefWidth(210);
        kamertypeInput.setPrefWidth(210);
        buttonBox.setPrefWidth(320);

        FlowPane root = new FlowPane();

        root.getChildren().addAll(label,naam,naamInput,adres,adresInput,aankomstdatum,aankomstdatumInput,vertrekdatum,vertrekdatumInput,kamertype, kamertypeInput,buttonBox);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(root, 350, 250);
        primaryStage.setTitle("Tweepersoonsboekingen");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}