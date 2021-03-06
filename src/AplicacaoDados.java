
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AplicacaoDados {
    public void aplicarVacina(Aplicacao a1) throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
        File arquivo = new File("Aplicacoes.ser");
        if(arquivo.exists()){
            aplicacoes = listarAplicacoes(); //implementar
            
        }
        aplicacoes.add(a1);
        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream save = new ObjectOutputStream(fluxo)) {
            save.writeObject(aplicacoes);
        }
    }
    public ArrayList<Aplicacao> listarAplicacoes() throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Aplicacao> aplicacoes = new ArrayList<Aplicacao>();
        File arquivo = new File("Aplicacoes.ser");
        if(arquivo.exists()){
            FileInputStream fluxo = new FileInputStream(arquivo);
            ObjectInputStream load = new ObjectInputStream(fluxo);
            aplicacoes = (ArrayList<Aplicacao>) load.readObject();
            
            return aplicacoes;
        
        }else{
            return aplicacoes;
        }
    
    }
}
