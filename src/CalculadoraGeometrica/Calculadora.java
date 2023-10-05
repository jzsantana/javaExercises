package CalculadoraGeometrica;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String calculate = "SIM";

        while (calculate.equals("SIM")) {

            int calc;

            System.out.println("-".repeat(30) +
                    "\nGeometria Plana       [ 1 ] " +
                    "\nGeometria espacial    [ 2 ] \n" +
                    "-".repeat(30));

            System.out.println("Escolha o tipo de calculadora: ");
            calc = entrada.nextInt();

            switch (calc) {
                case 1:
                    System.out.println("Escolha a operação desejada:\n" +
                            "Triangulo Equilatero  -  [ 1 ]\n" +
                            "Quadrado              -  [ 2 ]\n" +
                            "Retangulo             -  [ 3 ]\n" +
                            "Circulo               -  [ 4 ]\n" +
                            "Hexagono              -  [ 5 ]\n" +
                            "");
                    System.out.println();
                    int opcao = entrada.nextInt();

                    switch (opcao) {
                        case 1:
                            double ladoEqui;
                            System.out.println("Digite o valor do lado do triângulo: ");
                            ladoEqui = entrada.nextDouble();
                            Equilatero equilatero = new Equilatero(ladoEqui);

                            System.out.println("Aqui estão seus resultados:\n" +
                                    "Area: " + equilatero.areaEquilatero() +
                                    "\nPerimetro: " + equilatero.perimetroEquilatero());
                            break;

                        case 2:
                            double ladoQuadrado;
                            System.out.println("Digite o valor do lado do quadrado: ");
                            ladoQuadrado = entrada.nextDouble();
                            Quadrado quadrado = new Quadrado(ladoQuadrado);

                            System.out.println("Aqui estão seus resultados \n" +
                                    "Area: " + quadrado.calcularArea() +
                                    "\nPerimetro: " + quadrado.calcularPerimetro());
                            break;

                        case 3:
                            double baseRet;
                            double alturaRet;

                            System.out.println("Digite o valor da base do retangulo: ");
                            baseRet = entrada.nextDouble();
                            System.out.println("Agora, digite o valor da altura do retangulo: ");
                            alturaRet = entrada.nextDouble();

                            Retangulo retangulo = new Retangulo(baseRet, alturaRet);

                            System.out.println("Aqui estão seus resultados \n" +
                                    "Area: " + retangulo.calcularArea() +
                                    "\nPerimetro: " + retangulo.calcularPerimetro());
                            break;

                        case 4:
                            double raio;
                            System.out.println("Digite o valor do raio do circulo: ");
                            raio = entrada.nextDouble();
                            Circulo circulo = new Circulo(raio);

                            System.out.println("Aqui estão seus resultados \n" +
                                    "Area: " + circulo.areaCirculo() +
                                    "\nPerimetro: " + circulo.perimetroCirculo());
                            break;

                        case 5:
                            double ladoHexa;
                            System.out.println("Digite o valor do lado do hexagono: ");
                            ladoHexa = entrada.nextDouble();
                            Hexagono hexagono = new Hexagono(ladoHexa);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Área: " + hexagono.areaHexagono() +
                                    "\nPerimetro: " + hexagono.perimetroHexagono());
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Escolha a operação desejada:\n" +
                            "Cubo                      - [ 1 ]\n" +
                            "Paralelepipido            - [ 2 ]\n" +
                            "Esfera                    - [ 3 ]\n" +
                            "Pirâmide de base quadrada - [ 4 ]\n" +
                            "Cilindro                  - [ 5 ]\n" +
                            "Cone                      - [ 6 ] ");

                    System.out.println();
                    int operation = entrada.nextInt();

                    // cubo
                    switch (operation){
                        case 1:
                            double aresta;
                            System.out.println("Digite o valor da aresta do cubo: ");
                            aresta = entrada.nextDouble();

                            Cubo cubo = new Cubo(aresta);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + cubo.calculeVolume() +
                                    "\nÁrea: " + cubo.cuboArea());
                            break;

                        case 2:
                            double valorA;
                            double valorB;
                            double valorC;
                            System.out.println("Digite o valor da altura ");
                            valorA = entrada.nextDouble();
                            System.out.println("Digite o valor de largura: ");
                            valorB = entrada.nextDouble();
                            System.out.println("Digite o valor do comprimento: ");
                            valorC = entrada.nextDouble();

                            Paralelepipedo para = new Paralelepipedo(valorA, valorB, valorC);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + para.volumeParalelepipedo() +
                                    "\nÁrea: " + para.areaParalelepipedo());
                            break;

                            // esfera
                        case 3:
                            double raioEsfera;
                            System.out.println("Digite o valor do raio da esfera: ");
                            raioEsfera = entrada.nextDouble();

                            Esfera esfera = new Esfera(raioEsfera);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + esfera.volEsfera() +
                                    "\nÁrea: " + esfera.areaEsfera());
                            break;

                            // piramide quadrada
                        case 4:
                            double arestaPiramide;
                            double altura;

                            System.out.println("Digite o valor da altura da piramide: ");
                            altura = entrada.nextDouble();

                            System.out.println("Digite o valor da aresta da piramide: ");
                            arestaPiramide = entrada.nextDouble();

                            Piramide piramide = new Piramide(altura, arestaPiramide);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + piramide.volPira() +
                                    "\nÁrea: " + piramide.areaBasePira());
                            break;

                            // cilindro
                        case 5:
                            double raioCil;
                            double alturaCil;
                            System.out.println("Digite o valor do raio do cilindro: ");
                            raioCil = entrada.nextDouble();
                            System.out.println("Digite o valor da altura do cilindro: ");
                            alturaCil = entrada.nextDouble();

                            Cilindro cilindro = new Cilindro(raioCil, alturaCil);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + cilindro.volumeCilindro() +
                                    "\nÁrea: " + cilindro.areaCilindro());
                            break;

                        // cone
                        case 6:
                            double alturaC;
                            double raioC;
                            System.out.println("Digite o valor da altura do cone: ");
                            alturaC = entrada.nextDouble();

                            System.out.println("Digite o valor do raio do cone: ");
                            raioC = entrada.nextDouble();

                            Cone cone = new Cone(alturaC, raioC);

                            System.out.println("Aqui estão seus resultados: \n" +
                                    "Volume: " + cone.areaCone() +
                                    "\nÁrea: " + cone.volumeCone());
                            break;
                    }
                break;
            }

            System.out.println("Deseja fazer outro calculo? [Sim/Não]");
            calculate = entrada.next().toUpperCase();
        }
    }
}