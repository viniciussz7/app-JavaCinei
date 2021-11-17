package modelo;

import dados.VacinaDados;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Vacina implements Serializable {

    private String fabricante;
    private long lote;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;
    private String tipoDose;
    
    public Vacina() {}
    
    public Vacina(String fabricante, long lote, LocalDate dataFabricacao, LocalDate dataVencimento, String tipoDose) {
        this.fabricante = fabricante;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
        this.tipoDose = tipoDose;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public long getLote() {
        return lote;
    }
    
    public void setLote(long lote) {
        this.lote = lote;
    }
    
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
    
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    public String getTipoDose() {
        return tipoDose;
    }

    public void setTipoDose(String tipoDose) {
        this.tipoDose = tipoDose;
    }
    
    @Override
    public String toString(){
        return "Fabricante da Vacina "+getFabricante()+"\n"+"Lote "+getLote()+"\n"+" Data de Fabricação "+String.valueOf(getDataFabricacao())+"\n"+"Data de vencimento "+String.valueOf(getDataVencimento())+"\n\n";
    }

    public void cadastrarVacina(Vacina v) throws IOException, ClassNotFoundException {
        VacinaDados vd = new VacinaDados();
        vd.cadastrarVacina(v);
    }

    public ArrayList<Vacina> listarVacinas() throws IOException, ClassNotFoundException {
        VacinaDados vd = new VacinaDados();
        return vd.listarVacinas();
    }


}