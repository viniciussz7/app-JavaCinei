
import java.io.IOException;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class telaListaAtendentesController {

    @FXML
    private TableColumn<Atendente, Long> cpfAtendenteColumn;

    @FXML
    private TableColumn<Atendente, String> emailAtendenteColumn;

    @FXML
    private TableColumn<Atendente, Long> idAtendenteColumn;

    @FXML
    private TableColumn<Atendente, String> nomeAtendenteColumn;

    @FXML
    private TableView<Atendente> tableListaAtendentes;

    private AtendenteControle ac = new AtendenteControle();

    private ObservableList<Atendente> observableListAtendentes;

    public void initialize() {
        carregarTableAtendente();
    }

    public void carregarTableAtendente() {

        cpfAtendenteColumn.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        emailAtendenteColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        idAtendenteColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nomeAtendenteColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));

        try {
            observableListAtendentes = FXCollections.observableArrayList(ac.listarAtendentes());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tableListaAtendentes.setItems(observableListAtendentes);
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

