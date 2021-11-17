package viewTeste.controllers;

import java.io.IOException;

import control.AplicadorControle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Aplicador;

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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        tableListaAplicadores.setItems(observableListAplicadores);

    }

}

