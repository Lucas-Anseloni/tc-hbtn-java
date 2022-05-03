public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return salarioFixo * 0.1d;
        }
        return 0;
    }

    double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return salarioFixo * 1.1d;
        }
        return salarioFixo;
    }
}
