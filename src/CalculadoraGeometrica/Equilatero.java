package CalculadoraGeometrica;

public class Equilatero {

    double lado;

    public Equilatero(double lado){
        this.lado = lado;
    }

    double perimetroEquilatero(){
        return lado * 3;
    }

    double areaEquilatero(){
        return (Math.pow(lado, 2) * Math.sqrt(3))/4;
    }

}


