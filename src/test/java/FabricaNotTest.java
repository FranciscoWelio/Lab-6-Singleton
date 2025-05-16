import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FabricaNotTest {
    @Test
    void testCirculoNegativo1() {
        Circulo circulo = new Circulo();
        circulo.setRaio(-5);
        assertNotEquals("Círculo não pode ter raio negativo", circulo.getTipo() + " criado: Raio = "+ circulo.getRaio());
        // exceção para raio negativo
    }

    @Test
    void testCirculoNegativo2() {
        Circulo circulo = new Circulo();
        circulo.setRaio(0); // Raio zero
        assertNotEquals("Círculo inválido", circulo.getTipo() + " criado: Raio = "+ circulo.getRaio());
    }
    @Test
    void testTrianguloNegativo1() {
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(10);
        triangulo.setLadoB(10);
        triangulo.setLadoC(10);
        assertNotEquals("Triângulo Isósceles", triangulo.getTipo()); // Não deve ser Isósceles
    }

    @Test
    void testTrianguloNegativo2() {
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(1);
        triangulo.setLadoB(1);
        triangulo.setLadoC(3); // Não forma triângulo válido (1+1 < 3)
        assertNotEquals("Triângulo Isósceles", triangulo.getTipo()); // Deve ser "Não existente"
    }

    @Test
    void testTrianguloNegativo3() {
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(3);
        triangulo.setLadoB(4);
        triangulo.setLadoC(5);
        assertNotEquals("Triângulo Equilátero", triangulo.getTipo()); // Não deve ser Equilátero
    }

    @Test
    void testTrianguloNegativo4() {
        Triangulo triangulo = new Triangulo();
        triangulo.setLadoA(0);
        triangulo.setLadoB(0);
        triangulo.setLadoC(0); // Lados zero
        assertNotEquals("Triângulo Equilátero", triangulo.getTipo()); // Deve ser "Não existente"
    }
    @Test
    void testQuadradoNegativo1() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(10);
        quadrado.setAlturaA(10);
        quadrado.setAlturaB(9); // Alturas diferentes
        assertNotEquals("Quadrado", quadrado.getTipo()); // Não deve ser quadrado
    }

    @Test
    void testQuadradoNegativo2() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(8); // Lados diferentes
        quadrado.setAlturaA(10);
        quadrado.setAlturaB(10);
        assertNotEquals("Quadrado", quadrado.getTipo()); // Não deve ser quadrado
    }

    @Test
    void testRetanguloNegativo() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(10);
        quadrado.setAlturaA(4);
        quadrado.setAlturaB(5); // Alturas diferentes
        assertNotEquals("Retângulo", quadrado.getTipo()); // Não deve ser retângulo
    }
    @Test
    void testTrapezioIsoscelesNegativo() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(7);
        quadrado.setLadoB(6);
        quadrado.setAlturaA(3);
        quadrado.setAlturaB(4); // Alturas diferentes
        assertNotEquals("Trapézio Isósceles", quadrado.getTipo()); // Não deve ser isósceles
    }

    @Test
    void testTrapezioEscalenoNegativo() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(4);
        quadrado.setLadoB(6);
        quadrado.setAlturaA(3);
        quadrado.setAlturaB(3); // Alturas iguais
        assertNotEquals("Trapézio Escaleno", quadrado.getTipo()); // Deve ser isósceles
    }
    @Test
    void testQuadrilateroIrregularNegativo() {
        Quadrado quadrado = new Quadrado();
        quadrado.setLadoA(10);
        quadrado.setLadoB(10);
        quadrado.setAlturaA(10);
        quadrado.setAlturaB(10);
        assertNotEquals("Quadrilátero Irregular", quadrado.getTipo()); // Deve ser quadrado
    }
}
