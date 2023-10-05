package CalculadoraGeometrica;

public class Cone {
    double alturaCone;
    double raioCone;

    public Cone(double alturaCone, double raioCone){
        this.alturaCone = alturaCone;
        this.raioCone = raioCone;
    }
    double areaCone(){
        double altIncli = Math.sqrt(Math.pow(raioCone,2)+Math.pow(alturaCone,2));
        return Math.PI*Math.pow(raioCone,2)+Math.PI*raioCone*altIncli;
    }
    double volumeCone(){
        return 1.0/3.0*Math.PI*Math.pow(raioCone,2)*alturaCone;
    }
}
