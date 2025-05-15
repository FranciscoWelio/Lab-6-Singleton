public class Quadrado implements FiguraGeometrica{
    private double ladoA;
    private double ladoB;
    private double AlturaA;
    private double AlturaB;

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

    public double getAlturaA() {
        return AlturaA;
    }

    public void setAlturaA(double alturaA) {
        AlturaA = alturaA;
    }

    public double getAlturaB() {
        return AlturaB;
    }

    public void setAlturaB(double alturaB) {
        AlturaB = alturaB;
    }

    @Override
    public void CriarFigura() {
        System.out.println(getTipo()+ "Com lado a "+ getLadoA()+" Lado b "+ getLadoB() + " e Altura A "+getAlturaA() + " Altura b "+ getAlturaB());
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
        }else if(getLadoA() < getLadoB() && getAlturaA() == getAlturaB()){
            return "Trapézio Isósceles";
        }else if(getLadoA() < getLadoB() && getAlturaA() < getAlturaB()) {
            return "Trapézio Escaleno";
        }else {
            return "Quadrilátero Irregular";
        }
    }
}
