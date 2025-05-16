public class Main {
    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();
        System.out.println("\n Cículos\n");
        fabrica.fabricarCirculo(10);
        System.out.println("\n Triângulos\n");
        fabrica.fabricarTriangulo(-10,10,10);
        fabrica.fabricarTriangulo(10,10,5);
        fabrica.fabricarTriangulo(3, 4, 5);
        fabrica.fabricarTriangulo(5, 5, 15);
        System.out.println("\n Quadrados\n");
        fabrica.fabricarQuadrado(10,10,10,10);
        fabrica.fabricarQuadrado(10,10,4, 4);
        fabrica.fabricarQuadrado(7,6,3,3);
        fabrica.fabricarQuadrado(4,6,4,3);
        fabrica.fabricarQuadrado(6,4,3,5);

    }
}
