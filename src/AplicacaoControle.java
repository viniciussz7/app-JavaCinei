
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;




public class AplicacaoControle {
    private Paciente pp = new Paciente();

    public void AplicarVacina(Paciente paciente,Vacina vacina, Aplicador aplicador, LocalDate dataAplicacao, LocalDate dataProximaDose, int dose)throws IOException, ClassNotFoundException {
        Aplicacao a1 = new Aplicacao(paciente,vacina,aplicador,dataAplicacao,dataProximaDose,dose);
        a1.aplicarVacina(a1);
    }

    public ArrayList<Aplicacao> listarAplicacoes()throws IOException, ClassNotFoundException {
        Aplicacao a1 = new Aplicacao();
        return a1.listarAplicacoes();
    
    }

    /*public Paciente pesquisarAplicacao(Paciente p1) throws IOException, ClassNotFoundException {
        Paciente a1 = null;
        ArrayList<Paciente> listaAplicacoes = pp.listarPaciente();
        for (int i=0;i<listaAplicacoes.size();i++) {
            if (p1.equals(listaAplicacoes.get(i).getNome())) {
                a1 = p1;
                break;
            }
        }
        return a1;
    }*/
    
}
