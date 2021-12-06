

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


public class telaCadastroAtendenteController {

    private AtendenteControle at = new AtendenteControle();

    @FXML
    private TextField confirmPasswordAtendenteField;

    @FXML
    private TextField cpfAtendenteField;

    @FXML
    private TextField emailAtendenteField;

    @FXML
    private TextField idAtendenteField;

    @FXML
    private TextField nomeAtendenteField;

    @FXML
    private TextField passwordAtendenteField;

    @FXML
    void pressBtnCadastrar(ActionEvent event) {
        
        String comSenha = confirmPasswordAtendenteField.getText();
        String cpf = cpfAtendenteField.getText();
        String email = emailAtendenteField.getText();
        String id = idAtendenteField.getText();
        String nome = nomeAtendenteField.getText();
        String senha = passwordAtendenteField.getText();
        try {
            if (senha.equals(comSenha)) {
                at.cadastrarAtendente(Integer.parseInt(id),nome,Long.parseLong(cpf),email,senha);
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Sucess");
                alerta.setHeaderText("Atendente cadastrado com sucesso!");
                alerta.setContentText("Parabens");
                alerta.show();
                idAtendenteField.clear();                
                nomeAtendenteField.clear();                
                cpfAtendenteField.clear();                
                emailAtendenteField.clear();                
                passwordAtendenteField.clear();                
                confirmPasswordAtendenteField.clear();                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            e.printStackTrace();
        } catch( Exception e){
            e.printStackTrace();
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Atendente não foi cadastrado!");
            alerta.setContentText("Verifique os dados.");
            alerta.show();
        }

    }

    @FXML
    void pressBtnVoltar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

