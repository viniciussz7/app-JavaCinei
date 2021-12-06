

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class telaPesquisaVacinaController {

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnSalvar;

    @FXML
    private TextField lotePesquisaField;

    @FXML
    private DatePicker dadosDataFabricacaoField;

    @FXML
    private DatePicker dadosDataVencimentoField;

    @FXML
    private TextField dadosFabricanteField;

    @FXML
    private TextField dadosLoteField;

    @FXML
    private TextField dadosTipoDoseField;

    private VacinaControle vc = new VacinaControle();

    @FXML
    public void pressBtnEditar(ActionEvent event) {
        btnEditar.setDisable(true);

        dadosFabricanteField.setEditable(true);
        dadosLoteField.setEditable(true);
        dadosTipoDoseField.setEditable(true);
        dadosDataFabricacaoField.setEditable(true);
        dadosDataVencimentoField.setEditable(true);

        dadosLoteField.selectAll();
        dadosLoteField.requestFocus();

        btnSalvar.setDisable(false);
    }

    @FXML
    public void pressBtnPesquisar(ActionEvent event) {

        try {            
            btnSalvar.setDisable(true);

            String lote = lotePesquisaField.getText();
            long loteLong = Long.parseLong(lote);
            Vacina vacina = vc.pesquisarVacina(loteLong);

            if (vacina != null) {
                
                dadosLoteField.setText(String.valueOf(vacina.getLote()));
                dadosFabricanteField.setText(vacina.getFabricante());
                dadosTipoDoseField.setText(vacina.getTipoDose());
                dadosDataFabricacaoField.setValue(vacina.getDataFabricacao());
                dadosDataVencimentoField.setValue(vacina.getDataVencimento());

            } else {

                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Atenção!");
                alerta.setHeaderText("Vacina não foi encontrada!");
                alerta.setContentText("Verifique o lote ou faça o cadastro.");
                alerta.show();
                lotePesquisaField.selectAll();
                lotePesquisaField.requestFocus();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pressBtnSalvar(ActionEvent event) {
        btnSalvar.setDisable(true);

        String fabricante = dadosFabricanteField.getText();
        String tipoDose = dadosTipoDoseField.getText();
        String lote = dadosLoteField.getText();
        LocalDate df = dadosDataFabricacaoField.getValue();
        LocalDate dv= dadosDataVencimentoField.getValue();

        try {
            vc.cadastrarVacina(fabricante,Long.parseLong(lote),df,dv, tipoDose);
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Sucess");
            alerta.setHeaderText("Vacina cadastrada com sucesso!");
            alerta.setContentText("Parabens!");
            alerta.show();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Error");
            alerta.setHeaderText("Não foi possível atualizar os dados.");
            alerta.setContentText("Verifique os campos.");
            alerta.show();
            dadosLoteField.selectAll();
            dadosLoteField.requestFocus();
        }

        btnEditar.setDisable(false);

    }

    @FXML
    public void pressCancelar(ActionEvent event) throws IOException {
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("telaMenuUser.fxml"));
        Scene scene = new Scene(root);
        s1.setTitle("JavaCinei - Menu de atendentes");
        s1.setScene(scene);
        s1.show();
    }

}

