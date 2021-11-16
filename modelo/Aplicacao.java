package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Aplicacao implements Serializable {
    private Paciente paciente;
    private Vacina vacina;
    private Aplicador aplicador;
    private Date dataAplicacao;
    private Date dataProximaDose;
    private int dose;
    
    public Aplicacao(Paciente paciente,Vacina vacina, Aplicador aplicador, Date dataAplicacao, Date dataProximaDose, int dose){
        this.paciente = paciente;
        this.vacina = vacina;
        this.aplicador = aplicador;
        this.dataAplicacao = dataAplicacao;
        this.dataProximaDose = dataProximaDose;
        this.dose = dose;
    }

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
    public Date getDataProximaDose() {
        return dataProximaDose;
    }
    public void setDataProximaDose(Date dataProximaDose) {
        this.dataProximaDose = dataProximaDose;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }
    
    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
    
    public int getDose() {
        return dose;
    }
    
    public void setDose(int dose) {
        this.dose = dose;
    }
    
}
