package todaPiscina;

public class Piscina {

    public Piscina() {
        calcularVolume();
    }

    private double largura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    private double comprimento;

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    private double profundidade;

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    double calcularVolume() {
        return largura * comprimento * profundidade;
    }

}
