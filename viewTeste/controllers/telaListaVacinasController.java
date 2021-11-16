package viewTeste.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class telaListaVacinasController {

    @FXML
    private TableColumn<?, ?> dataFabricacaoVacinaColumn;

    @FXML
    private TableColumn<?, ?> dataVencimentoVacinaColumn;

    @FXML
    private TableColumn<?, ?> fabricanteVacinaColumn;

    @FXML
    private TableColumn<?, ?> loteVacinaColumn;

    @FXML
    private TableView<?> tableListaVacinas;

}

