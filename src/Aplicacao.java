import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;



public class Aplicacao implements Serializable {
    private Paciente paciente;
    private Vacina vacina;
    private Aplicador aplicador;
    private LocalDate dataAplicacao;
    private LocalDate dataProximaDose;
    private int dose;
    
    public Aplicacao(Paciente paciente,Vacina vacina, Aplicador aplicador, LocalDate dataAplicacao, LocalDate dataProximaDose, int dose){
        this.paciente = paciente;
        this.vacina = vacina;
        this.aplicador = aplicador;
        this.dataAplicacao = dataAplicacao;
        this.dataProximaDose = dataProximaDose;
        this.dose = dose;
    }

    public Aplicacao() {}

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Vacina getVacina() {
        return vacina;
    }
    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
    public Aplicador getAplicador() {
        return aplicador;
    }
    public void setAplicador(Aplicador aplicador) {
        this.aplicador = aplicador;
    }
    public LocalDate getDataProximaDose() {
        return dataProximaDose;
    }
    public void setDataProximaDose(LocalDate dataProximaDose) {
        this.dataProximaDose = dataProximaDose;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }
    
    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
    public void aplicarVacina(Aplicacao at) throws IOException, ClassNotFoundException {
        AplicacaoDados ad = new AplicacaoDados();
        ad.aplicarVacina(at);
    }

    public ArrayList<Aplicacao> listarAplicacoes() throws IOException, ClassNotFoundException {
        AplicacaoDados ad = new AplicacaoDados();
        return ad.listarAplicacoes();
    }
    
    public int getDose() {
        return dose;
    }
    
    public void setDose(int dose) {
        this.dose = dose;
    }
    
}
