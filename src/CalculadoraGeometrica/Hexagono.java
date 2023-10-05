package CalculadoraGeometrica;

public class Hexagono {

    double ladoHexagono;

    public Hexagono(double ladoHexagono){
        this.ladoHexagono = ladoHexagono;
    }

    double perimetroHexagono(){
        return 6*ladoHexagono;
    }

    double areaHexagono(){
        return 3*ladoHexagono * ((Math.sqrt(3)/2)*ladoHexagono);
    }

}