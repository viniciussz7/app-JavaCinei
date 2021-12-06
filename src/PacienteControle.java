
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class PacienteControle {
    
    public void cadastrarPaciente(String nome,long cpf, LocalDate dataNascimento, long cep, long telefone, boolean dose1,boolean dose2, boolean dose3) throws IOException, ClassNotFoundException {
        Paciente p = new Paciente(nome, cpf, dataNascimento, cep, telefone, dose1, dose2, dose3);
        p.cadastrarPaciente(p);
    }

    public Paciente pesquisarPaciente(long cpf) throws IOException, ClassNotFoundException {
        Paciente p = null;
        ArrayList<Paciente> listaPacientes = listarPacientes();
        for (Paciente paciente : listaPacientes) {
            if (cpf == paciente.getCpf()) {
                p = paciente;
                break;
            }
        }
        return p;
    }

    public ArrayList<Paciente> listarPacientes() throws IOException, ClassNotFoundException {
        Paciente p = new Paciente();
        return p.listarPacientes();
    }

    public void removerPaciente(long cpfPaciente) throws ClassNotFoundException, IOException {
        Paciente p = pesquisarPaciente(cpfPaciente);
        p.removerPaciente(p);
        
    }

}
