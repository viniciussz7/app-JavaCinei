package viewTeste.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import control.PacienteControle;

public class telaCadastroPacienteController {

    private PacienteControle pca = new PacienteControle();

    @FXML
    private TextField cepPacienteField;

    @FXML
    private TextField cpfPacienteField;

    @FXML
    private DatePicker dataNascimentoPacienteField;

    @FXML
    private TextField nomePacienteField;

    @FXML
    private TextField telefonePacienteField;

    @FXML
    void pressBtnCadastrar(ActionEvent event) {
        String cep = cepPacienteField.getText();
        String cpf = cpfPacienteField.getText();
        String nome = nomePacienteField.getText();
        String fone = telefonePacienteField.getText();
        LocalDate df = dataNascimentoPacienteField.getValue();
        cepPacienteField.clear();
        cpfPacienteField.clear();
        nomePacienteField.clear();
        telefonePacienteField.clear();
        try {
            pca.cadastrarPaciente(nome,Long.parseLong(cpf),df,Long.parseLong(cep),Long.parseLong(fone));
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Paciente cadastrado com sucesso!");
            alerta.setContentText("Parabens");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Paciente não foi cadastrado!");
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

}



