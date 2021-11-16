package control;

import java.io.IOException;
import java.util.ArrayList;

import modelo.Aplicador;

public class AplicadorControle {
    
    public void cadastrarAplicador(long coren, String nome, long cpf,String funcao) throws IOException, ClassNotFoundException {
        Aplicador ap = new Aplicador(coren, nome, cpf, funcao);
        ap.cadastrarAplicador(ap);
    }

    public Aplicador pesquisarAplicador(long coren) throws IOException, ClassNotFoundException {
        Aplicador ap = null;
        ArrayList<Aplicador> listaAplicadores = listarAplicadores();
        for (Aplicador aplicador : listaAplicadores) {
            if (coren == aplicador.getCoren()) {
                ap = aplicador;
                break;
            }
        }
        return ap;
    }

    public ArrayList<Aplicador> listarAplicadores() throws IOException, ClassNotFoundException {
        Aplicador ap = new Aplicador();
        return ap.listarAplicadores();
    }
}
