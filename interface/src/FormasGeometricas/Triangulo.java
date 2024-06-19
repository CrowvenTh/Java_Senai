package FormasGeometricas;

public class Triangulo implements Formas{
    public double base;
    public double altura;
    public double lado1;
    public double lado2;
    public double lado3;
    
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public String getNomeFigura(){
        return "Triangulo";
    }
    @Override
    public double getArea(){
        return(base * altura) / 2;
    }
    @Override
    public double getPerimetro(){
        return lado1 + lado2 + lado3;
    }
}
