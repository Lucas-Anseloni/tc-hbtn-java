public class Gerente extends Empregado{

        public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    
    double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return ((salarioFixo * 0.2d) + (departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01d);
        }
        return 0;
    }

    double calcularSalarioTotal(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return  salarioFixo + ((salarioFixo * 0.2d) + (departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01d);
        }
        return salarioFixo;
    }
}
