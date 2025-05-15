public class Triangulo implements FiguraGeometrica{

    double ladoA;
    double ladoB;
    double ladoC;

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
        if(getLadoA() == getLadoB() && getLadoA() == getLadoC()){
            return "Equilátero";
        }else if(getLadoA() == getLadoB() && getLadoA() != getLadoC() && getLadoB() != getLadoC()){
            return "Isósceles";
        }else if(getLadoA() != getLadoB() && getLadoA() != getLadoC() && getLadoB() != getLadoC()){
            return "Escaleno";
        }else {
            return "Não existente";
        }

    }
    @Override
    public String getTipo() {
        String s = "Triângulo" + tipo();
        return s;
    }
}
