

import java.io.IOException;
import java.time.LocalDate;


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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        tableListaVacinas.setItems(observableListVacina);

    }

    @FXML
    void pressBtnVoltar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

