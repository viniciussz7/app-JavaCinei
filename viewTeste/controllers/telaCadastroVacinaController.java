package viewTeste.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;
import control.VacinaControle;

public class telaCadastroVacinaController implements Initializable {
    private VacinaControle vc = new VacinaControle();
    
    @FXML
    private DatePicker dataFabricacaoField;

    @FXML
    private DatePicker dataVencimentoField;

    @FXML
    private ComboBox<String> fabricanteCombobox;

    @FXML
    private TextField loteField;

    @FXML
    private ComboBox <String> tipoDoseCombobox;

    private ArrayList<String> vacinas = new ArrayList<>();
    private ArrayList<String> doses = new ArrayList<>();

    private ObservableList<String> obsVacinas;
    private ObservableList<String> obsDoses;


    @FXML
    void pressBtnCadastrar(ActionEvent event) {
        String cbVacinas = fabricanteCombobox.getSelectionModel().getSelectedItem();
        String cbDoses = tipoDoseCombobox.getSelectionModel().getSelectedItem();
        String lote = loteField.getText();
        LocalDate df = dataFabricacaoField.getValue();
        LocalDate dv= dataVencimentoField.getValue();
        try {
            vc.cadastrarVacina(cbVacinas,Long.parseLong(lote),df,dv, cbDoses);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Vacina cadastrada com sucesso!");
            alerta.setContentText("Parabens");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Error");
            alerta.setHeaderText("Vacina não foi cadastrada!");
            alerta.setContentText("Verifique os dados.");
            alerta.show();

        }

    }

    @FXML
    void pressBtnVoltar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUsers.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarVac();
        carregarDose();
    }

    @FXML
    void carregarVac() {
        String v1 = new String("CoronaVac");
        String v2 = new String("Pfizer/BioNTech");
        String v3 = new String("Oxford/AstraZeneca");
        vacinas.add(v1);
        vacinas.add(v2);
        vacinas.add(v3);
        obsVacinas = FXCollections.observableArrayList(vacinas);
        fabricanteCombobox.setItems(obsVacinas);

    }

    public void carregarDose() {
        String v1 = new String("Dose única");
        String v2 = new String("Duas doses");
        String v3 = new String("Três doses");
        doses.add(v1);
        doses.add(v2);
        doses.add(v3);
        obsDoses = FXCollections.observableArrayList(doses);
        tipoDoseCombobox.setItems(obsDoses);
    }



}

