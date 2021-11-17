package viewTeste.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class telaLoginAtendenteController {

    @FXML
    private Hyperlink cancelarLink;

    @FXML
    private Hyperlink esqueciSenhaLink;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Hyperlink primeiroAcessoLink;

    @FXML
    private TextField userNameField;

    @FXML
    void pressBtnEntrar(ActionEvent event) {

    }

    @FXML
    void pressCancelar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaInicial.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Perfil");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressEsqueciSenha(ActionEvent event) {

    }

    @FXML
    void pressPrimeiroAcesso(ActionEvent event) {

    }

}
