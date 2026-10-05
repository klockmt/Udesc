import java.util.ArrayList;

public class Funcionario {

    private int matricula;
    private String nome;
    private double salario;

    public Funcionario(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    public double getSalarioMensal(){
        return salario;
    }

    public boolean setSalarioMensal(double salario) {
        if (salario >= 0) {
            this.salario = salario;
            return true;
        } else {
            return false;
        }
    }

    
}