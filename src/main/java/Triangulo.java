public class Triangulo implements FiguraGeometrica{

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) throws IllegalArgumentException{
        if(ladoA <= 0){
            throw new IllegalArgumentException("O lado deve ser maior que 0");
        }
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) throws IllegalArgumentException {
        if(ladoB <= 0){
            throw new IllegalArgumentException("O lado deve ser maior que 0");
        }
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) throws IllegalArgumentException {
        if(ladoC <= 0){
            throw new IllegalArgumentException("O lado deve ser maior que 0");
        }
        this.ladoC = ladoC;
    }
    @Override
    public void CriarFigura() {
        if (getLadoC()<=0|| getLadoB()<=0 || getLadoA()<=0){
            throw new IllegalStateException("Criação inválida de triângulo");
        }
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
