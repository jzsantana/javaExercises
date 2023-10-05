package CalculadoraGeometrica;
public class Cubo {

    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    double calculeVolume(){
        return Math.pow(aresta, 3);
    }

    double cuboArea(){
        return 6 * (Math.pow(aresta, 2));
    }
}