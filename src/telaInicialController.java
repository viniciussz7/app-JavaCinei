

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class telaInicialController  {

    @FXML
    void pressBtnAtendente(ActionEvent event) throws IOException, ClassNotFoundException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaLoginAtendente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Login");
        s1.setScene(scene);
        s1.show();
    }

    @FXML
    void pressBtnPaciente(ActionEvent event) throws IOException, ClassNotFoundException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuPaciente.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de pacientes");
        s1.setScene(scene);
        s1.show();
    }

}
