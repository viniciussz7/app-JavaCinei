package control;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import modelo.*;


public class AplicacaoControle {
    public AplicacaoControle(){
        
        
    
    }
    public void AplicarVacina(Paciente p1,Vacina v1,Aplicador a1,Date dataAplicacao, Date dataProximaDose)throws IOException, ClassNotFoundException {
        Aplicacao a1 = new Aplicacao(p1,v1,dataAplicacao,dataProximadose);
        a1.aplicarVacina(a1);
    }
    public ArrayList<Aplicacao> listarAplicacoes()throws IOException, ClassNotFoundException {
        Aplicacao a1 = new  Aplicacao();
        a1.listarAplicaoes();
    
    }/*
    public Aplicador pesquisarAplicador(Paciente p1) throws IOException, ClassNotFoundException {
       Aplicacao a1 = null;
        ArrayList<Aplicacao> listaAplicacoes = listarAplicacoes();
        for (Aplicacao aplicacao: listaAplicacoes ) {
            if (p1.equals()) {
                ap = aplicador;
                break;
            }
        }
        return ap;
    }*/
    
}
