package viewTeste.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class telaPesquisaPacienteController {

    @FXML
    private Tab abaDadosPessoais;

    @FXML
    private Tab abaDose1;

    @FXML
    private Tab abaDose2;

    @FXML
    private Tab abaDose3;

    @FXML
    private Tab abaStatusVacinacao;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField cpfPesquisaField;

    @FXML
    private TextField dadosCepPacienteField;

    @FXML
    private TextField dadosCpfPacienteField;

    @FXML
    private DatePicker dadosDataNascimentoPacienteField;

    @FXML
    private TextField dadosNomePacienteField;

    @FXML
    private TextField dadosTelefonePacienteField;

    @FXML
    private TextField dose1CorenAplicadorField;

    @FXML
    private DatePicker dose1DataAplicacaoField;

    @FXML
    private DatePicker dose1DataProximaDoseField;

    @FXML
    private TextField dose1NomeAplicadorField;

    @FXML
    private CheckBox dose1StatusCheckBox;

    @FXML
    private TextField dose2CorenAplicadorField;

    @FXML
    private DatePicker dose2DataAplicacaoField;

    @FXML
    private DatePicker dose2DataProximaDoseField;

    @FXML
    private TextField dose2NomeAplicadorField;

    @FXML
    private CheckBox dose2StatusCheckBox;

    @FXML
    private TextField dose3CorenAplicadorStatusField;

    @FXML
    private DatePicker dose3DataAplicacaoField;

    @FXML
    private DatePicker dose3DataProximaDoseField;

    @FXML
    private TextField dose3NomeAplicadorStatusField;

    @FXML
    private CheckBox dose3StatusCheckBox;

    @FXML
    void pressBtnEditar(ActionEvent event) {

    }

    @FXML
    void pressBtnPesquisar(ActionEvent event) {

    }

    @FXML
    void pressBtnSalvar(ActionEvent event) {

    }

    @FXML
    void pressCancelar(ActionEvent event) {

    }

}

