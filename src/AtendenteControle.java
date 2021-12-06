

import java.io.IOException;
import java.util.ArrayList;


public class AtendenteControle {

    public void cadastrarAtendente(int id, String nome, long cpf, String email, String password) throws IOException, ClassNotFoundException {
        Atendente at = new Atendente(id, nome, cpf, email, password);
        at.cadastrarAtendente(at);
    }

    public Atendente pesquisarAtendente(long cpf) throws IOException, ClassNotFoundException {
        Atendente at = null;
        ArrayList<Atendente> listaAtendentes = listarAtendentes();
        for (Atendente atendente : listaAtendentes) {
            if (cpf == atendente.getCpf()) {
                at = atendente;
                break;
            }
        }
        return at;
    }

    public ArrayList<Atendente> listarAtendentes() throws IOException, ClassNotFoundException {
        Atendente at = new Atendente();
        return at.listarAtendentes();
    }

    public void removerAtendente(long cpf) throws ClassNotFoundException, IOException {
        Atendente p = pesquisarAtendente(cpf);
        p.removerAtendente(p);
        
    }

}
