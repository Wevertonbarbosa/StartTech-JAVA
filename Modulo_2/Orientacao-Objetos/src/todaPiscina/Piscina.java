package todaPiscina;

public class Piscina {
    public Piscina() {
        this.largura = largura;
        this.comprimento = comprimento;
        this.profundidade = profundidade;
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


    @Override
    public String toString() {
        return String.valueOf(largura * comprimento * profundidade);
    }



}
