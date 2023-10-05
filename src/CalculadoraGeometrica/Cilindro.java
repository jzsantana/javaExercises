package CalculadoraGeometrica;

public class Cilindro {
    double raioCilindro;
    double alturaCilindro;

    public Cilindro(double raioCilindro, double alturaCilindro){
        this.raioCilindro = raioCilindro;
        this.alturaCilindro = alturaCilindro;
    }
    double volumeCilindro(){
        return Math.PI*Math.pow(raioCilindro,2)*alturaCilindro;
    }
    double areaCilindro(){
        return 2*Math.PI*raioCilindro*alturaCilindro + 2*Math.PI*Math.pow(raioCilindro,2);
    }

}

