

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;



public class Aplicador implements Serializable{
    private long coren;
    private String nome;
    private long cpf;
    private String funcao;
    public Aplicador(long coren, String nome, long cpf,String funcao){
        this.coren = coren;
        this.nome=nome;
        this.cpf= cpf;
        this.funcao= funcao;
    }
    public Aplicador(){}

    public void setCoren(long coren){
        this.coren= coren;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCpf(long cpf){
        this.cpf=cpf;
    }

    public void setFuncao(String funcao){
        this.funcao=nome;
    }

    public String getNome(){
        return nome;
    }
    public long getCpf(){
        return cpf;
    }
    public String getFuncao(){
        return funcao;
    }
    public long getCoren(){
        return coren;
    }
    @Override
    public String toString(){
        return "Coren: "+ getCoren()+"\n"+"Nome: "+getNome()+"\n"+"CPF: "+getCpf()+"Função: "+getFuncao()+"\n\n";
    }

    public void cadastrarAplicador(Aplicador ap) throws IOException, ClassNotFoundException {
        AplicadorDados ad = new AplicadorDados();
        ad.cadastrarAplicador(ap);
    }

    public ArrayList<Aplicador> listarAplicadores() throws IOException, ClassNotFoundException {
        AplicadorDados ad = new AplicadorDados();
        return ad.listarAplicadores();
    }

    public void removerAplicador(Aplicador p) throws FileNotFoundException, ClassNotFoundException, IOException {
        AplicadorDados pd = new AplicadorDados();
        pd.removerAplicador(p);
    }

}
