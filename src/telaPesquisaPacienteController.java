

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class telaPesquisaPacienteController {

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField cpfPesquisaField;

    @FXML
    private TextField dadosCepPacienteField;

    @FXML
    private TextField dadosCpfPacienteField;

    @FXML
    private DatePicker dadosDataNascimentoPacienteField;

    @FXML
    private TextField dadosNomePacienteField;

    @FXML
    private TextField dadosTelefonePacienteField;

    @FXML
    private TextField dose1CorenAplicadorField;

    @FXML
    private DatePicker dose1DataAplicacaoField;

    @FXML
    private DatePicker dose1DataProximaDoseField;

    @FXML
    private TextField dose1FabricanteVacinaField;

    @FXML
    private TextField dose1LoteVacinaField;

    @FXML
    private TextField dose1NomeAplicadorField;

    @FXML
    private CheckBox dose1StatusCheckBox;

    @FXML
    private TextField dose2CorenAplicadorField;

    @FXML
    private DatePicker dose2DataAplicacaoField;

    @FXML
    private DatePicker dose2DataProximaDoseField;

    @FXML
    private TextField dose2FabricanteVacinaField;

    @FXML
    private TextField dose2LoteVacinaField;

    @FXML
    private TextField dose2NomeAplicadorField;

    @FXML
    private CheckBox dose2StatusCheckBox;

    @FXML
    private TextField dose3CorenAplicadorField;

    @FXML
    private DatePicker dose3DataAplicacaoField;

    @FXML
    private DatePicker dose3DataProximaDoseField;

    @FXML
    private TextField dose3FabricanteVacinaField;

    @FXML
    private TextField dose3LoteVacinaField;

    @FXML
    private TextField dose3NomeAplicadorField;

    @FXML
    private CheckBox dose3StatusCheckBox;

    private PacienteControle pc = new PacienteControle();
    private AplicacaoControle ac = new AplicacaoControle();

    @FXML
    void pressBtnEditar(ActionEvent event) {

        btnEditar.setDisable(true);

        dadosNomePacienteField.setEditable(true);
        dadosCpfPacienteField.setEditable(true);
        dadosCepPacienteField.setEditable(true);
        dadosDataNascimentoPacienteField.setEditable(true);
        dadosTelefonePacienteField.setEditable(true);

        dadosNomePacienteField.selectAll();
        dadosNomePacienteField.requestFocus();

        btnSalvar.setDisable(false);
    }

    @FXML
    void pressBtnPesquisar(ActionEvent event) {
        
        try {
            btnSalvar.setDisable(true);

            String cpf = cpfPesquisaField.getText();
            long cpfLong = Long.parseLong(cpf);
            Paciente paciente = pc.pesquisarPaciente(cpfLong);

            if (paciente != null) {

                dadosCpfPacienteField.setText(Long.toString(paciente.getCpf()));
                dadosNomePacienteField.setText(paciente.getNome());
                dadosDataNascimentoPacienteField.setValue(paciente.getDataNascimento());
                dadosCepPacienteField.setText(Long.toString(paciente.getCep()));
                dadosTelefonePacienteField.setText(Long.toString(paciente.getTelefone()));

                if (paciente.isDose1()) {
                    dose1StatusCheckBox.setSelected(true);
                    Aplicacao p1 = new Aplicacao();
                    ArrayList<Aplicacao> listaAplicacoes = ac.listarAplicacoes();
                    for (Aplicacao aplicacao : listaAplicacoes) {
                        if (aplicacao.getPaciente() == paciente && aplicacao.getDose() == 1) {
                            p1 = aplicacao;
                            break;
                        }
                    }
                    dose1DataAplicacaoField.setValue(p1.getDataAplicacao());
                    dose1CorenAplicadorField.setText(Long.toString(p1.getAplicador().getCoren()));
                    dose1NomeAplicadorField.setText(p1.getAplicador().getNome());
                    dose1DataProximaDoseField.setValue(p1.getDataProximaDose());
                    dose1FabricanteVacinaField.setText(p1.getVacina().getFabricante());
                    dose1LoteVacinaField.setText(String.valueOf(p1.getVacina().getLote()));               
                }

                if (paciente.isDose2()) {
                    dose2StatusCheckBox.setSelected(true);
                    Aplicacao p2 = null;
                    ArrayList<Aplicacao> listaAplicacoes = ac.listarAplicacoes();
                    for (Aplicacao aplicacao : listaAplicacoes) {
                        if (aplicacao.getPaciente() == paciente && aplicacao.getDose() == 2) {
                            p2 = aplicacao;
                            break;
                        }
                    }
                    dose2DataAplicacaoField.setValue(p2.getDataAplicacao());
                    dose2CorenAplicadorField.setText(Long.toString(p2.getAplicador().getCoren()));
                    dose2NomeAplicadorField.setText(p2.getAplicador().getNome());
                    dose2DataProximaDoseField.setValue(p2.getDataProximaDose());
                    dose2FabricanteVacinaField.setText(p2.getVacina().getFabricante());
                    dose2LoteVacinaField.setText(String.valueOf(p2.getVacina().getLote()));                    
                }

                if (paciente.isDose3()) {
                    dose2StatusCheckBox.setSelected(true);
                    Aplicacao p3 = null;
                    ArrayList<Aplicacao> listaAplicacoes = ac.listarAplicacoes();
                    for (Aplicacao aplicacao : listaAplicacoes) {
                        if (aplicacao.getPaciente() == paciente && aplicacao.getDose() == 3) {
                            p3 = aplicacao;
                            break;
                        }
                    }
                    dose3DataAplicacaoField.setValue(p3.getDataAplicacao());
                    dose3CorenAplicadorField.setText(Long.toString(p3.getAplicador().getCoren()));
                    dose3NomeAplicadorField.setText(p3.getAplicador().getNome());
                    dose3DataProximaDoseField.setValue(p3.getDataProximaDose());
                    dose3FabricanteVacinaField.setText(p3.getVacina().getFabricante());
                    dose3LoteVacinaField.setText(String.valueOf(p3.getVacina().getLote()));                    
                }

            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Atenção!");
                alerta.setHeaderText("Paciente não foi encontrado!");
                alerta.setContentText("Verifique o CPF ou faça o cadastro.");
                alerta.show();
                cpfPesquisaField.selectAll();
                cpfPesquisaField.requestFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void pressBtnSalvar(ActionEvent event) {
        /*
        btnSalvar.setDisable(true);
        btnEditar.setDisable(false);

        String cep = dadosCepPacienteField.getText();
        String cpf = dadosCpfPacienteField.getText();
        String nome = dadosNomePacienteField.getText();
        String fone = dadosTelefonePacienteField.getText();
        LocalDate df = dadosDataNascimentoPacienteField.getValue();
        
        try {
            pc.cadastrarPaciente(nome,Long.parseLong(cpf),df,Long.parseLong(cep),Long.parseLong(fone));
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Dados alterados com sucesso!");
            alerta.setContentText("Muito bem!");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Não foi possível atualizar os dados.");
            alerta.setContentText("Verifique os campos.");
            alerta.show();
            dadosNomePacienteField.selectAll();
            dadosNomePacienteField.requestFocus();
        } 

        btnEditar.setDisable(false);*/
    }

    @FXML
    void pressCancelar(ActionEvent event) throws IOException {
        //if
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUsers.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

