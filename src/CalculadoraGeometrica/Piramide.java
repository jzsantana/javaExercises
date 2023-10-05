package CalculadoraGeometrica;

public class Piramide {
    double altura;
    double arestaPiramide;

    public Piramide(double altura, double aresta) {
        this.altura = altura;
        this.arestaPiramide = arestaPiramide;
    }

    double areaBasePira(){
        return Math.pow(arestaPiramide,3);
    }
    double volPira(){
        return (Math.pow(arestaPiramide, 3)*altura)/3;
    }
}

