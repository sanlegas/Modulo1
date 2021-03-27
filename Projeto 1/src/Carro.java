public class Carro {
    private String      modelo;
    private String      cor;
    private int         ano;
    private Marca       marca;
    private String      chassi;
    private Propietario propietario;
    private float       velocidadeMaxima;
    private float       velocidadeatual;
    private int         numeroPortas;
    private boolean     tetoSolar;
    private int         numeroMarchas;
    private int         marchaActual;
    private boolean     cambioAutomatico;
    private float       volumeCombustivel;

    public Carro(Propietario propietario,Marca marca) {
        this.propietario = propietario;
        this.marca = marca;
    }

    public void exibirVolumeCombustivel(){
        System.out.println("El volume combustivel es " + volumeCombustivel);
    }

    public float autonomia(float consumoMedio){
        return consumoMedio * volumeCombustivel;
    }

    public void acelera(){
        velocidadeatual += 1;
    }

    public void freia(){
        velocidadeatual = 0;
    }

    public void trocaMarcha(){
        if (marchaActual < numeroMarchas){
            marchaActual++;
        }
    }

    public void reduzMarcha(){
        if (marchaActual > 0){
            marchaActual--;
        }
    }

    public int getMarchaActual() {
        return marchaActual;
    }

    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeatual() {
        return velocidadeatual;
    }

    public void setVelocidadeatual(float velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public float getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(float volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", marca=" + marca +
                ", chassi='" + chassi + '\'' +
                ", propietario=" + propietario +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeatual=" + velocidadeatual +
                ", numeroPortas=" + numeroPortas +
                ", tetoSolar=" + tetoSolar +
                ", numeroMarchas=" + numeroMarchas +
                ", marchaActual=" + marchaActual +
                ", cambioAutomatico=" + cambioAutomatico +
                ", volumeCombustivel=" + volumeCombustivel +
                '}';
    }
}
