

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class telaPesquisaAplicadorController {

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField corenPesquisaField;

    @FXML
    private TextField dadosCorenAplicadorField;

    @FXML
    private TextField dadosCpfAplicadorField;

    @FXML
    private TextField dadosFuncaoAplicadorField;

    @FXML
    private TextField dadosNomeAplicadorField;

    private AplicadorControle ac = new AplicadorControle();

    @FXML
    void pressBtnEditar(ActionEvent event) {
        btnEditar.setDisable(true);

        dadosCorenAplicadorField.setEditable(true);
        dadosNomeAplicadorField.setEditable(true);
        dadosCpfAplicadorField.setEditable(true);
        dadosFuncaoAplicadorField.setEditable(true);

        dadosCorenAplicadorField.selectAll();
        dadosCorenAplicadorField.requestFocus();

        btnSalvar.setDisable(false);
    }

    @FXML
    void pressBtnPesquisar(ActionEvent event) {
        
        try {
            btnSalvar.setDisable(true);

            String coren = corenPesquisaField.getText();
            long corenLong = Long.parseLong(coren);
            Aplicador aplicador = ac.pesquisarAplicador(corenLong);

            if (aplicador != null) {
                
                dadosCorenAplicadorField.setText(coren);
                dadosNomeAplicadorField.setText(aplicador.getNome());
                dadosCpfAplicadorField.setText(Long.toString(aplicador.getCpf()));
                dadosFuncaoAplicadorField.setText(aplicador.getFuncao());

            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Atenção!");
                alerta.setHeaderText("Aplicador não foi encontrado!");
                alerta.setContentText("Verifique o COREN ou faça o cadastro.");
                alerta.show();
                corenPesquisaField.selectAll();
                corenPesquisaField.requestFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void pressBtnSalvar(ActionEvent event) {
        btnSalvar.setDisable(true);

        String coren = dadosCorenAplicadorField.getText();
        String nome = dadosNomeAplicadorField.getText();
        String cpf = dadosCpfAplicadorField.getText();
        String funcao = dadosFuncaoAplicadorField.getText();

        try {
            ac.cadastrarAplicador(Long.parseLong(coren),nome,Long.parseLong(cpf),funcao);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Dados alterados com sucesso!");
            alerta.setContentText("Muito bem!");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Não foi possível atualizar os dados!");
            alerta.setContentText("Verifique os campos.");
            alerta.show();
            dadosCorenAplicadorField.selectAll();
            dadosCorenAplicadorField.requestFocus();
        }

        btnEditar.setDisable(false);
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
