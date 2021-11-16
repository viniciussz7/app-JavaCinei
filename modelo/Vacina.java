package modelo;

import dados.VacinaDados;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Vacina implements Serializable {

    private String fabricante;
    private long lote;
    private Date dataFabricacao;
    private Date dataVencimento;
    
    public Vacina() {}
    
    public Vacina(String fabricante, long lote, Date dataFabricacao, Date dataVencimento) {
        this.fabricante = fabricante;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
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
    
    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public Date getDataVencimento() {
        return dataVencimento;
    }
    
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
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