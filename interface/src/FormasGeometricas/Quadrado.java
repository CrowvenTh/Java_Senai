package FormasGeometricas;

public class Quadrado implements Formas{

    private double lado;
    

    public Quadrado(double lado){
        this.lado = lado;
    }
    public String getNomeFigura(){
        return "Quadrado";
    }
    @Override
    public double getArea(){
        return lado * lado;
    }
    @Override
    public double getPerimetro(){
        return 4*lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

}
