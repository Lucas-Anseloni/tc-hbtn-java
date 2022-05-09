package resumo_pedido.provedores;

public interface ProvedorFrete {

    double calcularFrete(double peso, double valor);

    TipoProvedorFrete obterTipoProvedorFrete();
}
