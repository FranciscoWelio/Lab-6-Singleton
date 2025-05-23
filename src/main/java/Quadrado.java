public class Quadrado implements FiguraGeometrica{
    private double ladoA;
    private double ladoB;
    private double AlturaA;
    private double AlturaB;

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

    public void setLadoB(double ladoB) throws IllegalArgumentException{
        if(ladoB <= 0){
            throw new IllegalArgumentException("O lado deve ser maior que 0");
        }
        this.ladoB = ladoB;
    }

    public double getAlturaA() {
        return AlturaA;
    }

    public void setAlturaA(double alturaA) throws IllegalArgumentException{
        if(alturaA <= 0){
            throw new IllegalArgumentException("A altura deve ser maior que 0");
        }
        AlturaA = alturaA;
    }

    public double getAlturaB() {
        return AlturaB;
    }

    public void setAlturaB(double alturaB) throws IllegalArgumentException{
        if(alturaB <= 0){
            throw new IllegalArgumentException("A altura deve ser maior que 0");
        }
        AlturaB = alturaB;
    }

    @Override
    public void CriarFigura() {
        if (getAlturaB() <= 0 || getAlturaA()<= 0|| getLadoB() <=0||getLadoA()<=0){
            throw new IllegalStateException("Valores inválidos para criação de um quadrado");
        }
        System.out.println(getTipo()+ " Com lado a "+ getLadoA()+" Lado b "+ getLadoB() + " e Altura A "+getAlturaA() + " Altura b "+ getAlturaB());
    }

    @Override
    public String getTipo() {
        String s = tipo();
        return s;

    }

    public String tipo(){
        if(getLadoA() == getLadoB() && getLadoA() == getAlturaA() && getLadoA() == getAlturaB()){
            return "Quadrado";
        }else if(getLadoA() == getLadoB() && getAlturaA() == getAlturaB()){
            return "Retângulo";
        }else if(getLadoA() > getLadoB() && getAlturaA() == getAlturaB()){
            return "Trapézio Isósceles";
        }else if(getLadoA() < getLadoB() && getAlturaA() > getAlturaB()) {
            return "Trapézio Escaleno";
        }else {
            return "Quadrilátero Irregular";
        }
    }
}
