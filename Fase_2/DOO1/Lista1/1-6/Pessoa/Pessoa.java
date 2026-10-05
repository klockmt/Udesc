public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjuge;

    public Pessoa(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    public double getPeso() {
        return this.peso;
    }

    public boolean setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
            return true;
        } else {
            return false;
        }

    }

    public double getAltura() {
        return this.altura;
    }

    public boolean setAltura(double altura) {
          if (altura > 0) {
            this.altura = altura;
            return true;
        } else {
            return false;
        }

    }

   public boolean casar(Pessoa outraPessoa) {
    if (this.ehCasado() || outraPessoa.ehCasado() || outraPessoa == this) {
        return false;
    }
    this.conjuge = outraPessoa;
    outraPessoa.conjuge = this;
    return true;
}

    public boolean ehCasado() {
         return this.conjuge != null;
    }

    public String getNomeConjuge() {
        return this.conjuge.getNome();
    }
}