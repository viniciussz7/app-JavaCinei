import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class telaPesquisaAtendenteController {

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField cpfPesquisaField;

    @FXML
    private TextField dadosCpfAtendenteField;

    @FXML
    private TextField dadosEmailAtendenteField;

    @FXML
    private TextField dadosIdAtendenteField;

    @FXML
    private TextField dadosNomeAtendenteField;

    @FXML
    private PasswordField dadosSenhaAtendenteField;

    private AtendenteControle ac = new AtendenteControle();

    @FXML
    void pressBtnEditar(ActionEvent event) {
        btnEditar.setDisable(true);

        dadosIdAtendenteField.setEditable(true);
        dadosNomeAtendenteField.setEditable(true);
        dadosCpfAtendenteField.setEditable(true);
        dadosEmailAtendenteField.setEditable(true);
        dadosSenhaAtendenteField.setEditable(true);

        dadosIdAtendenteField.selectAll();
        dadosIdAtendenteField.requestFocus();

        btnSalvar.setDisable(false);
    }

    @FXML
    void pressBtnPesquisar(ActionEvent event) {

        try {
            btnSalvar.setDisable(true);

            String cpf = cpfPesquisaField.getText();
            long cpfLong = Long.parseLong(cpf);
            Atendente atendente = ac.pesquisarAtendente(cpfLong);

            if (atendente != null) {
                
                dadosIdAtendenteField.setText(Integer.toString(atendente.getId()));
                dadosNomeAtendenteField.setText(atendente.getNome());
                dadosCpfAtendenteField.setText(Long.toString(atendente.getCpf()));
                dadosEmailAtendenteField.setText(atendente.getEmail());
                dadosSenhaAtendenteField.setText(atendente.getPassword());

            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Atenção!");
                alerta.setHeaderText("Atendente não foi encontrado!");
                alerta.setContentText("Verifique o CPF ou faça o cadastro.");
                alerta.show();
                cpfPesquisaField.selectAll();
                cpfPesquisaField.requestFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void pressBtnSalvar(ActionEvent event) {

        btnSalvar.setDisable(true);

        String cpf = dadosCpfAtendenteField.getText();
        String email = dadosEmailAtendenteField.getText();
        String id = dadosIdAtendenteField.getText();
        String nome = dadosNomeAtendenteField.getText();
        String senha = dadosSenhaAtendenteField.getText();
        try {
            
            ac.cadastrarAtendente(Integer.parseInt(id),nome,Long.parseLong(cpf),email,senha);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Dados alterados com sucesso!");
            alerta.setContentText("Muito bem!");
            alerta.show();                
            
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
            alerta.setHeaderText("Não foi possível atualizar os dados!");
            alerta.setContentText("Verifique os campos.");
            alerta.show();
            dadosIdAtendenteField.selectAll();
            dadosIdAtendenteField.requestFocus();
        }

        btnEditar.setDisable(false);
    }

    @FXML
    void pressCancelar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

