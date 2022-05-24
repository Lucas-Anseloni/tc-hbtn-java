package armazem;

public class Eletronico {

    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "["+this.getDescricao()+"]"+" R$ "+String.format("%.6f",this.getValor());
    }
}
