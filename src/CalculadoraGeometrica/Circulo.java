package CalculadoraGeometrica;

public class Circulo {
    double raio;

    //construtor
    public Circulo(double raio) {
          this.raio = raio;
    }

    double perimetroCirculo() {
        return ((2 * Math.PI) * raio);
    }

    double areaCirculo() {
        return (Math.PI * Math.pow(raio, 2));
    }
}