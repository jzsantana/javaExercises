package CalculadoraGeometrica;

public class Retangulo {

    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularPerimetro(){
        return 2 * (base+altura);
    }
    double calcularArea(){ return base * altura;}


}
