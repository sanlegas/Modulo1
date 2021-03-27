public class Marca {
    private String      nome;
    private int         nrDeModelos;
    private int         anoLancamento;
    private String      codigoIdentificador;

    public Marca(String nome, int nrDeModelos, int anoLancamento, String codigoIdentificador) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoLancamento = anoLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                ", nrDeModelos=" + nrDeModelos +
                ", anoLancamento=" + anoLancamento +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                '}';
    }
}
