package viewTeste.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class telaMenuPacienteController {

    @FXML
    void pressBtnVoltar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuPaciente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("Menu do paciente");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressPesquisarPaciente(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaPesquisaPaciente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("Pesquisa de pacientes");
        s1.setScene(scene);
        s1.show();
    }

}
