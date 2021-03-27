public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensual;
    public static Integer  contadorEmpregado = 0;

    public Empregado(String nome, String sobrenome, double salarioMensual) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensual = salarioMensual;
        contadorEmpregado++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }
}
