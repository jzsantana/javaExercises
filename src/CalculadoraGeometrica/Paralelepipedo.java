package CalculadoraGeometrica;

public class Paralelepipedo {

    double alturaPara;
    double larguraPara;
    double comprimentoPara;

    public Paralelepipedo(double alturaPara, double larguraPara, double comprimentoPara) {
        this.alturaPara = alturaPara;
        this.larguraPara = larguraPara;
        this.comprimentoPara = comprimentoPara;
    }


    double volumeParalelepipedo(){
        return alturaPara * larguraPara * comprimentoPara;
    }

    double areaParalelepipedo(){
        return 2*((larguraPara*alturaPara) + (alturaPara*comprimentoPara) + (larguraPara*comprimentoPara));
    }

}