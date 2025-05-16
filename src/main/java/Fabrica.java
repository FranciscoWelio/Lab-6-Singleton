
public class Fabrica {

    public void fabricarCirculo(int raio) {
        try {
            Circulo circulo = new Circulo();
            circulo.setRaio(raio);
            circulo.CriarFigura();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao fabricar círculo: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Erro de estado ao criar círculo: " + e.getMessage());
        }
    }
    public void fabricarTriangulo(double ladoA, double ladoB, double ladoC) {
        try {
            Triangulo triangulo = new Triangulo();
            triangulo.setLadoA(ladoA);
            triangulo.setLadoB(ladoB);
            triangulo.setLadoC(ladoC);
            triangulo.CriarFigura();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao fabricar triângulo: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Erro de estado ao criar triângulo: " + e.getMessage());
        }
    }
    public void fabricarQuadrado(double ladoA, double ladoB, double alturaA, double alturaB) {
        try {
            Quadrado quadrado = new Quadrado();
            quadrado.setLadoA(ladoA);
            quadrado.setLadoB(ladoB);
            quadrado.setAlturaA(alturaA);
            quadrado.setAlturaB(alturaB);
            quadrado.CriarFigura();
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao fabricar quadrado: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Erro de estado ao criar quadrado: " + e.getMessage());
        }
    }

}
