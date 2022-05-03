


public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo = 0;
    private double valorPenalidade = 5;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);

    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){

           this.saldo =  saldo - calcularTarifaMensal() + calcularJurosMensal() - valorPenalidade;
       }


    }
}
