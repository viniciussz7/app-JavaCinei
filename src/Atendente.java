

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;



public class Atendente implements Serializable{
    private int id;
    private String nome;
    private long cpf;
    private String email;
    private String password;
    
    public Atendente(int id, String nome, long cpf, String email, String password){
        this.id = id;
        this.nome=nome;
        this.cpf= cpf;
        this.email = email;
        this.password = password;
    }

    public Atendente(){}


    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public long getCpf(){
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "ID "+getId()+"\n"+"Nome "+getNome()+"\n"+"CFP "+getCpf()+"\n";
    }

    public void cadastrarAtendente(Atendente at) throws IOException, ClassNotFoundException {
        AtendenteDados ad = new AtendenteDados();
        ad.cadastrarAtendente(at);
    }

    public ArrayList<Atendente> listarAtendentes() throws IOException, ClassNotFoundException {
        AtendenteDados ad = new AtendenteDados();
        return ad.listarAtendentes();
    }

    public void removerAtendente(Atendente p) throws FileNotFoundException, ClassNotFoundException, IOException {
        AtendenteDados pd = new AtendenteDados();
        pd.removerAtendente(p);
    }


}