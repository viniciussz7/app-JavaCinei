package viewTeste.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class telaMenuUsersController {

    @FXML
    void pressAplicarVacina(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaAplicacaoVacina.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Aplicação da vacina");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressBtnVoltar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaInicial.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Perfil");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressCadastrarAplicador(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaCadastroAplicador.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Cadastro de aplicador");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressCadastrarAtendente(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaCadastroAtendente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Cadastro do atendente");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressCadastrarPaciente(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaCadastroPaciente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Cadastro do paciente");
        s1.setScene(scene);
        s1.show();

    }

    @FXML
    void pressCadastrarVacina(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaCadastroVacina.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Cadastro de vacina");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressConsultarAplicacao(ActionEvent event) {

    }

    @FXML
    void pressListarAplicacoes(ActionEvent event) throws IOException  {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaListaAplicacoes.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Lista de aplicações");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressListarAplicadores(ActionEvent event) throws IOException{
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaListaAplicadores.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Lista de aplicadores");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressListarAtendentes(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaListaAtendentes.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Lista de atendentes");
        s1.setScene(scene);
        s1.show();

    }

    @FXML
    void pressListarPacientes(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaListaPacientes.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Lista de pacientes");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressListarVacinas(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaListaVacinas.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Lista de vacinas");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressPesquisarAplicador(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaPesquisaAplicador.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Pesquisa de aplicadores");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressPesquisarAtendente(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaPesquisaAtendente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Pesquisa de atendentes");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressPesquisarPaciente(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaPesquisaPaciente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Pesquisa de pacientes");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressPesquisarVacina(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaPesquisaVacina.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Pesquisa de vacinas");
        s1.setScene(scene);
        s1.show();
    }

}

