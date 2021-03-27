import java.util.Date;

public class Propietario {
    private String          nome;
    private String          cpf;
    private String          rg;
    private Date            dataNascimiento;
    private Endereco        endereco;

    public Propietario(String nome, String cpf, String rg,Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimiento() {
        return dataNascimiento;
    }

    public void setDataNascimiento(Date dataNascimiento) {
        this.dataNascimiento = dataNascimiento;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimiento=" + dataNascimiento +
                ", endereco=" + endereco +
                '}';
    }
}
