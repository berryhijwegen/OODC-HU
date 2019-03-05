package inleveropdrachten.opdracht8b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.time.LocalDate;

public class BoekingenApp extends Application{
    private Hotel hotel = new Hotel("Avondrust");
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

        kamertypeInput.getItems().addAll(hotel.getKamerTypen());
        kamertypeInput.getSelectionModel().selectFirst();
        aankomstdatumInput.setValue(LocalDate.now());
        vertrekdatumInput.setValue(LocalDate.now().plusDays(1));

        FlowPane root = new FlowPane();
        root.getChildren().addAll(label,naam,naamInput,adres,adresInput,aankomstdatum,aankomstdatumInput,vertrekdatum,vertrekdatumInput,kamertype, kamertypeInput,buttonBox);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));


        EventHandler<ActionEvent> resetEvent = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                naamInput.setText("");
                adresInput.setText("");
                aankomstdatumInput.setValue(LocalDate.now());
                vertrekdatumInput.setValue(LocalDate.now().plusDays(1));
                kamertypeInput.getSelectionModel().selectFirst();
            }
        };

        EventHandler<ActionEvent> boekenEvent = new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                if(naamInput.getText().equals("") || adresInput.getText().equals("")){
                    System.out.println("error: lege input");
                    label.setText("Vul alle velden in!");
                    label.setStyle("-fx-text-fill: red;");
                }
                else if(aankomstdatumInput.getValue().isBefore(LocalDate.now()) || vertrekdatumInput.getValue().isBefore(LocalDate.now())){
                    System.out.println("error: datum in verleden");
                    label.setText("Vul een datum in de toekomst in!");
                    label.setStyle("-fx-text-fill: red;");
                }
                else if(!aankomstdatumInput.getValue().isBefore(vertrekdatumInput.getValue())){
                    System.out.println("error: Vertrekdatum voor aankomstdatum");
                    label.setText("De aankomstdatum moet voor de vertrekdatum zijn!");
                    label.setStyle("-fx-text-fill: red;");
                }
                else {
                    KamerType kamertype = (KamerType) kamertypeInput.getValue();
                    System.out.println(kamertype);
                    if(hotel.voegBoekingToe(aankomstdatumInput.getValue(), vertrekdatumInput.getValue(), naamInput.getText(), adresInput.getText(), kamertype) == -1){
                        label.setText("Boeking niet succesvol!");
                        label.setStyle("-fx-text-fill: red;");
                    }
                    else{
                        label.setText("De boeking was succesvol!");
                        label.setStyle("-fx-text-fill: black");
                        System.out.println(hotel.toString());
                    }
                }
            }
        };

        boekBtn.setOnAction(boekenEvent);
        resetBtn.setOnAction(resetEvent);

        Scene scene = new Scene(root, 350, 275);
        primaryStage.setTitle("Tweepersoonsboekingen");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}