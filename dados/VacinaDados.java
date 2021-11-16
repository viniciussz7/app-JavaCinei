package dados;

import modelo.Vacina;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class VacinaDados{
   
    public void cadastrarVacina(Vacina v)throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Vacina> vacinas = new ArrayList<>();
        File arquivo = new File("DadosVacina.ser");
        if(arquivo.exists()){
            vacinas = listarVacinas();
        }
        vacinas.add(v);
        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream salvar = new ObjectOutputStream(fluxo)) {
            salvar.writeObject(vacinas);
        }

    }
    public ArrayList<Vacina> listarVacinas()throws FileNotFoundException, ClassNotFoundException, IOException{
        ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
        File arquivo = new File("DadosVacina.ser");
        if(arquivo.exists()){
            FileInputStream fluxo = new FileInputStream(arquivo);
            ObjectInputStream ler = new ObjectInputStream(fluxo);
            vacinas = (ArrayList<Vacina>) ler.readObject();
            ler.close();
            return vacinas;
        }else{
            return vacinas;
        }

    }

}