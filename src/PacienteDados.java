


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PacienteDados {
    
    public void cadastrarPaciente(Paciente p) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        File arquivo = new File ("listaPacientes.ser");
        if (arquivo.exists()){
            pacientes = listarPacientes(); //implementar
        }
        
        pacientes.add(p);
        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream save = new ObjectOutputStream(fluxo)) {
            save.writeObject(pacientes);
        }
        
    }
    
    public ArrayList<Paciente> listarPacientes() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        File arquivo = new File ("listaPacientes.ser");
        if(arquivo.exists()) {
            FileInputStream fluxo = new FileInputStream(arquivo);
            ObjectInputStream load = new ObjectInputStream(fluxo);
            pacientes = (ArrayList<Paciente>) load.readObject();
            load.close();
            return pacientes;
        } else {
            return pacientes;        
        }
        
    }


    public void removerPaciente(Paciente p) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        File arquivo = new File("listaPacientes.ser");
        if (arquivo.exists()) {
            listaPacientes = listarPacientes();
        }

        for (Paciente paciente : listaPacientes) {
            if (p.getCpf() == paciente.getCpf()) {
                listaPacientes.remove(paciente);
                break;
            }
        }

        FileOutputStream fluxo = new FileOutputStream(arquivo);
        try (ObjectOutputStream save = new ObjectOutputStream(fluxo)) {
            save.writeObject(listaPacientes);
        }
    }
}
