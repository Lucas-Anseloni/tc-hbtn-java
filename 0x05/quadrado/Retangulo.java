

import retangulo_completo.FormaGeometrica;

public class Retangulo extends FormaGeometrica {

    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if (largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws IllegalArgumentException{
        if (altura < 0){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    @Override
    public double area(){
        return this.altura * this.largura;
    }

    @Override
    public String toString(){
        String result;
        result = String.format("[Retangulo] %.2f / %.2f",largura,altura);
        return result;
    }
}
