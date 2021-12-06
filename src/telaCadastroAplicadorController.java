

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class telaCadastroAplicadorController {

    private AplicadorControle ac = new AplicadorControle();

    @FXML
    private TextField corenAplicadorField;

    @FXML
    private TextField cpdAplicadorField;

    @FXML
    private TextField funcaoAplicadorField;

    @FXML
    private TextField nomeAplicadorField;

    @FXML
    void pressBtnCadastrar(ActionEvent event) {
        
        String coren = corenAplicadorField.getText();
        String nome = nomeAplicadorField.getText();
        String cpf = cpdAplicadorField.getText();
        String funcao = funcaoAplicadorField.getText();
        try {
            ac.cadastrarAplicador(Long.parseLong(coren),nome,Long.parseLong(cpf),funcao);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Aplicador cadastrado com sucesso!");
            alerta.setContentText("Parabens");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Aplicador não foi cadastrado!");
            alerta.setContentText("Verifique os dados.");
            alerta.show();
        }

        corenAplicadorField.clear();
        nomeAplicadorField.clear();
        cpdAplicadorField.clear();
        funcaoAplicadorField.clear();

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



