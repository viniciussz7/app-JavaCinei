



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente implements Serializable{
    private String nome;
    private long cep;
    private long cpf;
    private long telefone;
    private LocalDate dataNascimento;
    private boolean dose1;
    private boolean dose2;
    private boolean dose3;

    public Paciente(String nome,long cpf, LocalDate dataNascimento, long cep, long telefone, boolean dose1, boolean dose2, boolean dose3){
        this.nome=nome;
        this.cep=cep;
        this.cpf= cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.dose1 = dose1;
        this.dose2 = dose2;
        this.dose3 = dose3;
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
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
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

    public void removerPaciente(Paciente p) throws FileNotFoundException, ClassNotFoundException, IOException {
        PacienteDados pd = new PacienteDados();
        pd.removerPaciente(p);
    }

    public boolean isDose1() {
        return dose1;
    }

    public void setDose1(boolean dose1) {
        this.dose1 = dose1;
    }

    public boolean isDose2() {
        return dose2;
    }

    public void setDose2(boolean dose2) {
        this.dose2 = dose2;
    }

    public boolean isDose3() {
        return dose3;
    }

    public void setDose3(boolean dose3) {
        this.dose3 = dose3;
    }


}