
import exceptions.*;

public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo = 0;
    private double valorPenalidade = 5;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;

    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal(){
       if (saldo == 0 || saldo <= saldoMinimo){
           this.saldo =  (saldo - calcularTarifaMensal() + calcularJurosMensal()) - valorPenalidade;
       }else {
           this.saldo =  saldo - calcularTarifaMensal() + calcularJurosMensal();
       }


    }
}
