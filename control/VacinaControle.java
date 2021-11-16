package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import modelo.Vacina;

public class VacinaControle {

    public void cadastrarVacina(String fabricante, long lote, Date dataFabricacao, Date dataVencimento)  throws IOException, ClassNotFoundException {
        Vacina v = new Vacina(fabricante, lote, dataFabricacao, dataVencimento);
        v.cadastrarVacina(v);
    }

    public Vacina pesquisarVacina(long lote) throws IOException, ClassNotFoundException {
        Vacina v = null;
        ArrayList<Vacina> listaVacinas = listarVacinas();
        for (Vacina vacina : listaVacinas) {
            if (lote == vacina.getLote()) {
                v = vacina;
                break;
            }
        }
        return v;
    }

    public ArrayList<Vacina> listarVacinas() throws IOException, ClassNotFoundException {
        Vacina v = new Vacina();
        return v.listarVacinas();
    }
    
}
