

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


public class telaListaAplicadoresController {

    @FXML
    private TableColumn<Aplicador, Long> corenAplicadorColumn;

    @FXML
    private TableColumn<Aplicador, Long> cpfAplicadorColumn;

    @FXML
    private TableColumn<Aplicador, String> funcaoAplicadorColumn;

    @FXML
    private TableColumn<Aplicador, String> nomeAplicadorColumn;

    @FXML
    private TableView<Aplicador> tableListaAplicadores;

    private AplicadorControle ac = new AplicadorControle();

    private ObservableList<Aplicador> observableListAplicadores;

    public void initialize () {
        carregarTableAplicador();
    }

    public void carregarTableAplicador() {

        cpfAplicadorColumn.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        corenAplicadorColumn.setCellValueFactory(new PropertyValueFactory<>("coren"));
        nomeAplicadorColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        funcaoAplicadorColumn.setCellValueFactory(new PropertyValueFactory<>("funcao"));

        try {
            observableListAplicadores = FXCollections.observableArrayList(ac.listarAplicadores());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        tableListaAplicadores.setItems(observableListAplicadores);

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

