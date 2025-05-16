import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FabricaTest {
    @Test
    void testCirculo(){
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        assertEquals("Círculo criado: Raio = 10", circulo.getTipo() + " criado: Raio = "+ circulo.getRaio());
    }
    @Test
    void testTriangulo1(){
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(10);
        triangulo.setLadoB(10);
        triangulo.setLadoC(10);
        assertEquals("Triângulo Equilátero", triangulo.getTipo());
    }
    @Test
    void testTriangulo2(){
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(10);
        triangulo.setLadoB(10);
        triangulo.setLadoC(5);
        assertEquals("Triângulo Isósceles", triangulo.getTipo());
    }
    @Test
    void testTriangulo3(){
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(3);
        triangulo.setLadoB(4);
        triangulo.setLadoC(5);
        assertEquals("Triângulo Escaleno", triangulo.getTipo());
    }
    @Test
    void testTriangulo4(){
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(5);
        triangulo.setLadoB(5);
        triangulo.setLadoC(15);
        assertEquals("Triângulo Não existente", triangulo.getTipo());
    }
    @Test
    void testQuadrado(){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(10);
        quadrado.setAlturaA(10);
        quadrado.setAlturaB(10);
        assertEquals("Quadrado", quadrado.getTipo());
    }
    @Test
    void testQuadrado2(){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(10);
        quadrado.setAlturaA(4);
        quadrado.setAlturaB(4);
        assertEquals("Retângulo", quadrado.getTipo());
    }
    @Test
    void testQuadrado3(){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(7);
        quadrado.setLadoB(6);
        quadrado.setAlturaA(3);
        quadrado.setAlturaB(3);
        assertEquals("Trapézio Isósceles", quadrado.getTipo());
    }
    @Test
    void testQuadrado4(){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(4);
        quadrado.setLadoB(6);
        quadrado.setAlturaA(10);
        quadrado.setAlturaB(3);
        assertEquals("Trapézio Escaleno", quadrado.getTipo());
    }
    @Test
    void testQuadrado5(){
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(6);
        quadrado.setLadoB(4);
        quadrado.setAlturaA(3);
        quadrado.setAlturaB(5);
        assertEquals("Quadrilátero Irregular", quadrado.getTipo());
    }

}
