package control;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Vacina;

public class VacinaControle {

    public void cadastrarVacina(String fabricante, long lote, LocalDate dataFabricacao, LocalDate dataVencimento, String tipoDose)  throws IOException, ClassNotFoundException {
        Vacina v = new Vacina(fabricante, lote, dataFabricacao, dataVencimento, tipoDose);
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
