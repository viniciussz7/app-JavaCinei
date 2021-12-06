

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

public class telaListaAplicacoesController {

    @FXML
    private TableColumn<Aplicacao, Long> corenAplicadorAplicacaoColumn;

    @FXML
    private TableColumn<Aplicacao, LocalDate> dataAplicacaoColumn;

    @FXML
    private TableColumn<Aplicacao, Integer> doseAplicacaoColumn;

    @FXML
    private TableColumn<Aplicacao, String> fabricanteVacinaAplicacaoColumn;

    @FXML
    private TableColumn<Aplicacao, String> nomePacienteAplicacaoColumn;

    @FXML
    private TableView<Aplicacao> tableListaAplicacoes;

    private AplicacaoControle ac = new AplicacaoControle();
    private ObservableList<Aplicacao> observableListAplicacao;

    public void initialize() {
        carregarTableAplicacao();
    }

    public void carregarTableAplicacao() {
        corenAplicadorAplicacaoColumn.setCellValueFactory(new PropertyValueFactory<>("aplicador"));
        nomePacienteAplicacaoColumn.setCellValueFactory(new PropertyValueFactory<>("paciente"));
        fabricanteVacinaAplicacaoColumn.setCellValueFactory(new PropertyValueFactory<>("vacina"));
        doseAplicacaoColumn.setCellValueFactory(new PropertyValueFactory<>("dose"));
        dataAplicacaoColumn.setCellValueFactory(new PropertyValueFactory<>("dataAplicacao"));

        try {
            observableListAplicacao = FXCollections.observableList(ac.listarAplicacoes());
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        tableListaAplicacoes.setItems(observableListAplicacao);
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

