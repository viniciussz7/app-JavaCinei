

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


    
    public void initialize() {
        carregarTablePaciente();       
    }



    public void carregarTablePaciente()  {

        cepPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("cep"));
        cpfPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        dataNascimentoPacienteColumn.setCellValueFactory(new PropertyValueFactory<>("dataNascimento"));
        nomePacienteColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        telefonePacienteColumn.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        
        try {
            observableListPacientes = FXCollections.observableArrayList(pc.listarPacientes());
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        tableListaPacientes.setItems(observableListPacientes);

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