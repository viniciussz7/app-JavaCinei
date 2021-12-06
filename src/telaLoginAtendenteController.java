

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

    private AtendenteControle ac = new AtendenteControle();
    private ArrayList<Atendente> listaAtendente = new ArrayList<>();

    @FXML
    void pressBtnEntrar(ActionEvent event) {
        String email = userNameField.getText();
        String senha = passwordField.getText();

        try {

            if (email.equals("admin@admin.com") && senha.equals("admin")) {
    
                Stage s1 = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
                Scene scene = new Scene(root);
                s1.setTitle("JavaCinei - Menu de atendentes");
                s1.setScene(scene);
                s1.show();
                
            } else {
                
                try {
        
                    listaAtendente = ac.listarAtendentes();

                    if (!listaAtendente.isEmpty()) {
                        for (Atendente atendente : listaAtendente) {
                            int i = 0;
                            if (email.equals(atendente.getEmail()) && senha.equals(atendente.getPassword())) {
                                Stage s1 = new Stage();
                                Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
                                Scene scene = new Scene(root);
                                s1.setTitle("JavaCinei - Menu de atendentes");
                                s1.setScene(scene);
                                s1.show();
                                break;
                            }
                            
                            if(i+1 == listaAtendente.size()){
                                Alert alerta = new Alert(Alert.AlertType.ERROR);
                                alerta.setTitle("Atenção!");
                                alerta.setHeaderText("Login e senha inválidos!");
                                alerta.setContentText("Verifique os campos ou solicite o seu cadastro no sistema.");
                                alerta.show();
                                userNameField.selectAll();
                                userNameField.requestFocus();                    
                            }
                        }                        
                    } else {
                        Alert alerta = new Alert(Alert.AlertType.ERROR);
                        alerta.setTitle("Atenção!");
                        alerta.setHeaderText("Não há usuários cadastrados.");
                        alerta.setContentText("Procure o admin do sistema.");
                        alerta.show();
                        userNameField.selectAll();
                        userNameField.requestFocus();
                    }
        
                } catch (ClassNotFoundException e) {            
                    e.printStackTrace();
                } catch (IOException e) {            
                    e.printStackTrace();
                }
            }

            passwordField.clear();
            userNameField.clear();
            
        } catch (Exception e) {
            e.printStackTrace();
        }


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
    void pressPrimeiroAcesso(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaCadastroAtendente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Perfil");
        s1.setScene(scene);
        s1.show();
    }

}
