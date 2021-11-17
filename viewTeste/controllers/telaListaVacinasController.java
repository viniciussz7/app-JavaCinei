package viewTeste.controllers;

import java.io.IOException;
import java.time.LocalDate;

import control.VacinaControle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Vacina;

public class telaListaVacinasController {

    @FXML
    private TableColumn<Vacina, LocalDate> dataFabricacaoVacinaColumn;

    @FXML
    private TableColumn<Vacina, LocalDate> dataVencimentoVacinaColumn;

    @FXML
    private TableColumn<Vacina, String> fabricanteVacinaColumn;

    @FXML
    private TableColumn<Vacina, Long> loteVacinaColumn;

    @FXML
    private TableView<Vacina> tableListaVacinas;

    private VacinaControle vc = new VacinaControle();

    private ObservableList<Vacina> observableListVacina;

    public void initialize() {
        carregarTableVacina();
    }

    public void carregarTableVacina() {

        dataFabricacaoVacinaColumn.setCellValueFactory(new PropertyValueFactory<>("dataFabricacao"));
        dataVencimentoVacinaColumn.setCellValueFactory(new PropertyValueFactory<>("dataVencimento"));
        fabricanteVacinaColumn.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        loteVacinaColumn.setCellValueFactory(new PropertyValueFactory<>("lote"));

        try {
            observableListVacina = FXCollections.observableArrayList(vc.listarVacinas());
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tableListaVacinas.setItems(observableListVacina);

    }

}

