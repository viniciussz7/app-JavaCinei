package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import modelo.Paciente;

public class PacienteControle {
    
    public void cadastrarPaciente(String nome,long cpf, Date dataNascimento, long cep, long telefone) throws IOException, ClassNotFoundException {
        Paciente p = new Paciente(nome, cpf, dataNascimento, cep, telefone);
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

}
