package viewTeste.controllers;

import java.io.IOException;
import java.time.LocalDate;
import control.AplicacaoControle;
import control.AplicadorControle;
import control.PacienteControle;
import control.VacinaControle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class telaAplicacaoVacinaController {
    
    private AplicacaoControle ap = new AplicacaoControle();
    private AplicadorControle ac = new AplicadorControle();
    private PacienteControle pc = new PacienteControle();
    private VacinaControle vc = new VacinaControle();

    @FXML
    private Tab abaAplicacaoVacina;

    @FXML
    private Button btnEditar;

    @FXML
    private TextField corenAplicadorAplicacaoField;

    @FXML
    private TextField cpfPacienteAplicacaoField;

    @FXML
    private TextField dadosCpfPacienteAplicacaoField;

    @FXML
    private DatePicker dadosDataAplicacaoAplicacaoField;

    @FXML
    private TextField dadosFabricanteVacinaAplicacaoField;

    @FXML
    private TextField dadosLoteVacinaAplicacaoField;

    @FXML
    private TextField dadosNomeAplicadorAplicacaoField;

    @FXML
    private TextField dadosNomePacienteAplicacaoField;

    @FXML
    private ToggleGroup dose;

    @FXML
    private RadioButton dose1Radio;

    @FXML
    private RadioButton dose2Radio;

    @FXML
    private RadioButton dose3Radio;

    @FXML
    private TextField loteVacinaAplicacaoField;

    @FXML
    void pressBtnAplicar(ActionEvent event) throws IOException, ClassNotFoundException {
        RadioButton doses = (RadioButton) dose.getSelectedToggle();
        String coren = corenAplicadorAplicacaoField.getText();
        String cpfPaciente = cpfPacienteAplicacaoField.getText();
        String dadosCpfPaciente = dadosCpfPacienteAplicacaoField.getText();
        LocalDate DataAplicacao = dadosDataAplicacaoAplicacaoField.getValue();
        String fabriacante = dadosFabricanteVacinaAplicacaoField.getText();
        String lote = dadosLoteVacinaAplicacaoField.getText();
        String nomePaciente = dadosNomePacienteAplicacaoField.getText();
        ap.AplicarVacina(pc.pesquisarPaciente(Long.parseLong(cpfPaciente)),vc.pesquisarVacina(Long.parseLong(lote)),ac.pesquisarAplicador(Long.parseLong(coren)),DataAplicacao,null,Integer.parseInt(String.valueOf(doses)));


    }

    @FXML
    void pressBtnEditar(ActionEvent event) {

    }

    @FXML
    void pressBtnProximo(ActionEvent event) {

    }

    @FXML
    void pressCancelar(ActionEvent event) {

    }

}
