

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo = 0.0;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor para deposito deve ser maior que 0\n");
        }else {
            this.saldo = this.saldo + valor;
        }
    }

    void sacar(double valor){
        if (valor < 0){
            System.out.println("Valor de saque deve ser menor que 0\n");
        }else if (valor > saldo){
            System.out.println("Valor de saque deve ser menor que o saldo atual\n");
        }else {
            saldo = saldo - valor;
        }
    }

    double calcularTarifaMensal(){
        if (saldo * 0.10 < 10){
            return saldo * 0.10;
        }
        return 10;
    }

    double calcularJurosMensal(){
        if (saldo < 0){
            return 0.00;
        }
        return saldo * ((taxaJurosAnual / 100) / 12);
    }

    void aplicarAtualizacaoMensal(){
        this.saldo =  saldo - calcularTarifaMensal() + calcularJurosMensal();

    }
}
