

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class telaAplicacaoVacinaController {    
    
    private AplicacaoControle ap = new AplicacaoControle();
    private AplicadorControle ac = new AplicadorControle();
    private PacienteControle pc = new PacienteControle();
    private VacinaControle vc = new VacinaControle();

    @FXML
    private Tab abaAplicacaoVacina;

    @FXML
    private Button btnEditar;

    @FXML
    private TextField corenAplicadorAplicacaoField;

    @FXML
    private TextField cpfPacienteAplicacaoField;

    @FXML
    private TextField dadosCpfPacienteAplicacaoField;

    @FXML
    private DatePicker dadosDataAplicacaoAplicacaoField;

    @FXML
    private TextField dadosFabricanteVacinaAplicacaoField;

    @FXML
    private TextField dadosLoteVacinaAplicacaoField;

    @FXML
    private TextField dadosNomeAplicadorAplicacaoField;

    @FXML
    private TextField dadosNomePacienteAplicacaoField;

    @FXML
    private ToggleGroup dose;

    @FXML
    private RadioButton dose1Radio;

    @FXML
    private RadioButton dose2Radio;

    @FXML
    private RadioButton dose3Radio;

    @FXML
    private Label labelFullDose;

    @FXML
    private Button btnAplicar;

    @FXML
    private TextField loteVacinaAplicacaoField;

    Paciente pacienteAplicar = new Paciente();
    Vacina vacinaAplicar = new Vacina();
    Aplicador aplicadorAplicar = new Aplicador();

    @FXML
    void pressBtnAplicar(ActionEvent event) throws IOException, ClassNotFoundException {
        LocalDate dataAplicacao = LocalDate.now();
        LocalDate dataProximaDose = null;

        if (vacinaAplicar.getFabricante().equals("CoronaVac")) {
            dataProximaDose = dataAplicacao.plusDays(30);
        }
        if (vacinaAplicar.getFabricante().equals("Oxford/AstraZeneca")) {
            dataProximaDose = dataAplicacao.plusDays(90);
        }
        if (vacinaAplicar.getFabricante().equals("Pfizer/BioNTech")) {
            dataProximaDose = dataAplicacao.plusDays(90);
        }

        RadioButton doses = (RadioButton) dose.getSelectedToggle();

        if (doses.getText().equals("1 Dose")) {
            Paciente pacienteAntigo = pacienteAplicar;
            pc.removerPaciente(pacienteAntigo.getCpf());
            pacienteAplicar.setDose1(true);
            pc.cadastrarPaciente(pacienteAplicar.getNome(), pacienteAplicar.getCpf(), pacienteAplicar.getDataNascimento(), pacienteAplicar.getCep(), pacienteAplicar.getTelefone(), pacienteAplicar.isDose1(), pacienteAplicar.isDose2(), pacienteAplicar.isDose3());
            int dose = 1;
            ap.AplicarVacina(pacienteAplicar, vacinaAplicar, aplicadorAplicar, dataAplicacao, dataProximaDose, dose);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Aplicação feita com sucesso!");
            alerta.setContentText("Viva o SUS!");
            alerta.show();
            dadosCpfPacienteAplicacaoField.clear();
            dadosFabricanteVacinaAplicacaoField.clear();
            dadosLoteVacinaAplicacaoField.clear();
            dadosNomeAplicadorAplicacaoField.clear();
            dadosNomePacienteAplicacaoField.clear();
            cpfPacienteAplicacaoField.clear();
            corenAplicadorAplicacaoField.clear();
            loteVacinaAplicacaoField.clear();
            
        }

        else if (doses.getText().equals("2 Dose")) {
            Paciente pacienteAntigo = pacienteAplicar;
            pc.removerPaciente(pacienteAntigo.getCpf());
            pacienteAplicar.setDose2(true);
            pc.cadastrarPaciente(pacienteAplicar.getNome(), pacienteAplicar.getCpf(), pacienteAplicar.getDataNascimento(), pacienteAplicar.getCep(), pacienteAplicar.getTelefone(), pacienteAplicar.isDose1(), pacienteAplicar.isDose2(), pacienteAplicar.isDose3());
            int dose = 2;
            ap.AplicarVacina(pacienteAplicar, vacinaAplicar, aplicadorAplicar, dataAplicacao, dataProximaDose, dose);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Aplicação feita com sucesso!");
            alerta.setContentText("Viva o SUS!");
            alerta.show();
            dadosCpfPacienteAplicacaoField.clear();
            dadosFabricanteVacinaAplicacaoField.clear();
            dadosLoteVacinaAplicacaoField.clear();
            dadosNomeAplicadorAplicacaoField.clear();
            dadosNomePacienteAplicacaoField.clear();
            cpfPacienteAplicacaoField.clear();
            corenAplicadorAplicacaoField.clear();
            loteVacinaAplicacaoField.clear();
        }

        else if (doses.getText().equals("3 Dose")) {
            Paciente pacienteAntigo = pacienteAplicar;
            pc.removerPaciente(pacienteAntigo.getCpf());
            pacienteAplicar.setDose3(true);
            pc.cadastrarPaciente(pacienteAplicar.getNome(), pacienteAplicar.getCpf(), pacienteAplicar.getDataNascimento(), pacienteAplicar.getCep(), pacienteAplicar.getTelefone(), true, true, true);
            int dose = 3;
            ap.AplicarVacina(pacienteAplicar, vacinaAplicar, aplicadorAplicar, dataAplicacao, dataProximaDose, dose);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Aplicação feita com sucesso!");
            alerta.setContentText("Viva o SUS!");
            alerta.show();
            dadosCpfPacienteAplicacaoField.clear();
            dadosFabricanteVacinaAplicacaoField.clear();
            dadosLoteVacinaAplicacaoField.clear();
            dadosNomeAplicadorAplicacaoField.clear();
            dadosNomePacienteAplicacaoField.clear();
            cpfPacienteAplicacaoField.clear();
            corenAplicadorAplicacaoField.clear();
            loteVacinaAplicacaoField.clear();
        }

        else if (String.valueOf(doses).equals("")) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Ora, ora!");
            alerta.setContentText("Selecione a dose.");
            alerta.show();
        }
       
    }

    @FXML
    void pressBtnProximo(ActionEvent event) {
        String cpf = cpfPacienteAplicacaoField.getText();
        String coren = corenAplicadorAplicacaoField.getText();
        String lote = loteVacinaAplicacaoField.getText();

        try {
            Paciente paciente = pc.pesquisarPaciente(Long.parseLong(cpf));
            Aplicador aplicador = ac.pesquisarAplicador(Long.parseLong(coren));
            Vacina vacina = vc.pesquisarVacina(Long.parseLong(lote));

            if (paciente != null && aplicador != null && vacina != null) {

                pacienteAplicar = paciente;
                vacinaAplicar = vacina;
                aplicadorAplicar = aplicador;
                
                dadosCpfPacienteAplicacaoField.setText(Long.toString(paciente.getCpf()));
                dadosNomePacienteAplicacaoField.setText(paciente.getNome());
                dadosLoteVacinaAplicacaoField.setText(Long.toString(vacina.getLote()));
                dadosFabricanteVacinaAplicacaoField.setText(vacina.getFabricante());
                dadosNomeAplicadorAplicacaoField.setText(aplicador.getNome());

                if (paciente.isDose1()) {
                    dose1Radio.setDisable(true);                    
                }
                if (paciente.isDose2()) {
                    dose2Radio.setDisable(true);                                          
                }
                if (paciente.isDose3()) {
                    dose3Radio.setDisable(true);
                    labelFullDose.setText("O paciente já tomou todas as doses.");
                    labelFullDose.setVisible(true);
                    btnAplicar.setDisable(true);
                }

            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("Não foi possível carregar os dados!");
                alerta.setContentText("Verifique os campos ou, ainda, certifique que o paciente, a vacina e o aplicador escolhidos estão cadastrados.");
                alerta.show();
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void pressCancelar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}
