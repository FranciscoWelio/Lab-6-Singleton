
public class Fabrica {

    public void fabricarCirculo(int raio){
        Circulo circulo = new Circulo();
        circulo.setRaio(raio);
        circulo.CriarFigura();

    }
    public void fabricarTriangulo(double ladoA,double ladoB,double ladoC){
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(ladoA);
        triangulo.setLadoB(ladoB);
        triangulo.setLadoC(ladoC);
        triangulo.CriarFigura();

    }
    public void fabricarQuadrado(double ladoA,double ladoB,double alturaA, double alturaB){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(ladoA);
        quadrado.setLadoB(ladoB);
        quadrado.setAlturaA(alturaA);
        quadrado.setAlturaB(alturaB);
        quadrado.CriarFigura();

    }

}
