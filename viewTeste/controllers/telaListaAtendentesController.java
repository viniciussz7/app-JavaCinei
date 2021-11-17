package viewTeste.controllers;

import java.io.IOException;

import control.AtendenteControle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Atendente;

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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tableListaAtendentes.setItems(observableListAtendentes);
    }

}

