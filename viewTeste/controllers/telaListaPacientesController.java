package viewTeste.controllers;

import java.io.IOException;
import java.time.LocalDate;
import control.PacienteControle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.Paciente;

public class telaListaPacientesController {

    @FXML
    private TableColumn<Paciente, Long> cepPacienteColumn;

    @FXML
    private TableColumn<Paciente, Long> cpfPacienteColumn;

    @FXML
    private TableColumn<Paciente, LocalDate> dataNascimentoPacienteColumn;

    @FXML
    private TableColumn<Paciente, String> nomePacienteColumn;

    @FXML
    private TableView<Paciente> tableListaPacientes;

    @FXML
    private TableColumn<Paciente, Long> telefonePacienteColumn;

    private PacienteControle pc = new PacienteControle();

    private ObservableList<Paciente> observableListPacientes;


    
    public void initialize() throws ClassNotFoundException, IOException {
        carregarTablePaciente();       
    }



    public void carregarTablePaciente() throws ClassNotFoundException, IOException {


        cepPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("cep"));
        cpfPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        dataNascimentoPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        nomePacienteColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefonePacienteColumn.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        
        observableListPacientes = FXCollections.observableArrayList(pc.listarPacientes());
        tableListaPacientes.setItems(observableListPacientes);


    }

}