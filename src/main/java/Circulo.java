public class Circulo implements FiguraGeometrica{

    private int raio;
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void CriarFigura() {
        System.out.println("Círculo criado: Raio = "+ getRaio());
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}
