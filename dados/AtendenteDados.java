package dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Atendente;

public class AtendenteDados {
    
    public void cadastrarAtendente(Atendente at) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
        File arquivo = new File ("listaAtendentes.ser");
        if (arquivo.exists()){
            atendentes = listarAtendentes(); //implementar
        }
        
        atendentes.add(at);
        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream save = new ObjectOutputStream(fluxo)) {
            save.writeObject(atendentes);
        }        
    }

    public ArrayList<Atendente> listarAtendentes() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Atendente> atendentes = new ArrayList<Atendente>();
        File arquivo = new File ("listaAtendentes.ser");
        if(arquivo.exists()) {
            FileInputStream fluxo = new FileInputStream(arquivo);
            ObjectInputStream load = new ObjectInputStream(fluxo);
            atendentes = (ArrayList<Atendente>) load.readObject();
            load.close();
            return atendentes;
        } else {
            return atendentes;        
        }
        
    }
}
