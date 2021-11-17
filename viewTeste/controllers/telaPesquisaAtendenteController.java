package viewTeste.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class telaPesquisaAtendenteController {

    @FXML
    private Tab abaDadosPessoais;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField cpfPesquisaField;

    @FXML
    private TextField dadosCpfAtendenrteField;

    @FXML
    private TextField dadosEmailAtendenteField;

    @FXML
    private TextField dadosIdAtendenteField;

    @FXML
    private TextField dadosNomeAtendenteField;

    @FXML
    private PasswordField dadosSenhaAtendenteField;

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
    void pressCancelar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUsers.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

