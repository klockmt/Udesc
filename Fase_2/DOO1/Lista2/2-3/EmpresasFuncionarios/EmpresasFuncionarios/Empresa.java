import java.util.ArrayList;

public class Empresa{
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void imprimeFuncionarios(){
        for (Funcionario fun : this.funcionarios){
            System.out.println("Matricula: "+ fun.getMatricula());
            System.out.println("Nome: "+ fun.getNome());
            System.out.println("Salario: "+ fun.getSalarioMensal());

        }         
    }

    public double getDespesasFolhasPagamento(){
        double total = 0;

        for (Funcionario fun : this.funcionarios){
            total = total + fun.getSalarioMensal();
        }         
        return total;
    }
    
    public void addFuncionario (Funcionario fun){
        this.funcionarios.add(fun);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
}