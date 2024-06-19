package FormasGeometricas;

public class Circulo implements Formas{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public String getNomeFigura(){
        return "Circulo";
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public double getPerimetro(){
        return 2 * Math.pow(Math.PI , 2);
    }
}
