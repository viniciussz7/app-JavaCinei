package modelo;

import dados.PacienteDados;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Paciente implements Serializable{
    private String nome;
    private long cep;
    private long cpf;
    private long telefone;
    private Date dataNascimento;

    public Paciente(String nome,long cpf, Date dataNascimento, long cep, long telefone){
        this.nome=nome;
        this.cep=cep;
        this.cpf= cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public Paciente(){}

    public  void setCep(long id){
        this.cep= id;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
   
    public void setCpf(long cpf){
        this.cpf=cpf;
    }

    public void setTelefone(long telefone){
        this.telefone=telefone;
    }

    public String getNome(){
        return nome;
    }

    public long getCpf(){
        return cpf;
    }
    public long getCep(){
        return cep;
    }
    
    public long getTelefone(){
        return telefone;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString(){
        return "Nome: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"CEP: "+getCep()+"\n"+" Telefone: "+getTelefone()+"\n\n";
    }


    public void cadastrarPaciente(Paciente p) throws IOException, ClassNotFoundException {
        PacienteDados pd = new PacienteDados();
        pd.cadastrarPaciente(p);
    }

    public ArrayList<Paciente> listarPacientes() throws IOException, ClassNotFoundException {
        PacienteDados pd = new PacienteDados();
        return pd.listarPacientes();
    }


}