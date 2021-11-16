package dados;

import modelo.Aplicador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AplicadorDados {

    public void cadastrarAplicador(Aplicador ap) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Aplicador> aplicadores = new ArrayList<Aplicador>();
        File arquivo = new File ("listaAplicadores.ser");
        if (arquivo.exists()){
            aplicadores = listarAplicadores(); //implementar
        }
        
        aplicadores.add(ap);
        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream save = new ObjectOutputStream(fluxo)) {
            save.writeObject(aplicadores);
        }        
    }

    public ArrayList<Aplicador> listarAplicadores() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Aplicador> aplicadores = new ArrayList<Aplicador>();
        File arquivo = new File ("listaAplicadores.ser");
        if(arquivo.exists()) {
            FileInputStream fluxo = new FileInputStream(arquivo);
            ObjectInputStream load = new ObjectInputStream(fluxo);
            aplicadores = (ArrayList<Aplicador>) load.readObject();
            load.close();
            return aplicadores;
        } else {
            return aplicadores;        
        }        
    }
}