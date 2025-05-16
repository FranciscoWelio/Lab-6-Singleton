public class Triangulo implements FiguraGeometrica{

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    @Override
    public void CriarFigura() {
        System.out.println(getTipo() + " Com Lado a "+ getLadoA() +" Lado b " +getLadoB()+ " Lado c "+getLadoC());
    }
    public String tipo(){
        if(!formaTrianguloValido()){
            return "Não existente";
        }
        if(getLadoA() == getLadoB() && getLadoA() == getLadoC()){
            return "Equilátero";
        }else if(getLadoA() == getLadoB() || getLadoA() == getLadoC() || getLadoB() == getLadoC()){
            return "Isósceles";
        }else{
            return "Escaleno";
        }

    }
    @Override
    public String getTipo() {
        String s = "Triângulo " + tipo();
        return s;
    }
    private boolean formaTrianguloValido() {
        double a = getLadoA();
        double b = getLadoB();
        double c = getLadoC();

        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
