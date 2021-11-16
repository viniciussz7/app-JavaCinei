package viewTeste.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class telaCadastroVacinaController {

    @FXML
    private DatePicker dataFabricacaoField;

    @FXML
    private DatePicker dataVencimentoField;

    @FXML
    private ComboBox<?> fabricanteCombobox;

    @FXML
    private TextField loteField;

    @FXML
    private ComboBox<?> tipoDoseCombobox;

    @FXML
    void pressBtnCadastrar(ActionEvent event) {

    }

    @FXML
    void pressBtnVoltar(ActionEvent event) {

    }

}

