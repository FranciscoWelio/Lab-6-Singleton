public class Circulo implements FiguraGeometrica{

    int raio;
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void CriarFigura() {
        System.out.println("Cículo criado: Raio = "+ getRaio());
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}
