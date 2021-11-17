package viewTeste.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class telaListaAplicacoesController {

    @FXML
    private TableColumn<?, ?> corenAplicadorAplicacaoColumn;

    @FXML
    private TableColumn<?, ?> dataAplicacaoColumn;

    @FXML
    private TableColumn<?, ?> doseAplicacaoColumn;

    @FXML
    private TableColumn<?, ?> fabricanteVacinaAplicacaoColumn;

    @FXML
    private TableColumn<?, ?> nomePacienteAplicacaoColumn;

    @FXML
    private TableView<?> tableListaAtendentes;
    
    @FXML
    private TextArea area;

    public void clique(ActionEvent event){
        try {
            area.setText(String.valueOf(at.listarAtendentes()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

