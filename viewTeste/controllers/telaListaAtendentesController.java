package viewTeste.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class telaListaAtendentesController {

    @FXML
    private TableColumn<?, ?> cpfAtendenteColumn;

    @FXML
    private TableColumn<?, ?> emailAtendenteColumn;

    @FXML
    private TableColumn<?, ?> idAtendenteColumn;

    @FXML
    private TableColumn<?, ?> nomeAtendenteColumn;

    @FXML
    private TableView<?> tableListaAtendentes;

}

