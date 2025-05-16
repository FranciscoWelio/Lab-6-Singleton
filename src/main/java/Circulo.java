public class Circulo implements FiguraGeometrica{

    private int raio;
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) throws IllegalArgumentException{
        if(raio <= 0){
            throw new IllegalArgumentException("Raio deve ser maior que 0");
        }
        this.raio = raio;
    }

    @Override
    public void CriarFigura() {
        if(raio <= 0){
            throw new IllegalStateException("Raio deve ser maior que 0");
        }
        System.out.println("Círculo criado: Raio = "+ getRaio());
    }

    @Override
    public String getTipo() {
        return "Círculo";
    }
}
