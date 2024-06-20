package FormasGeometricas;

public class App {
    public static void Info(Formas formas){
        Formas quadrado = new Quadrado(0);

        quadrado.getNomeFigura();
        quadrado.getArea();
        quadrado.getPerimetro();
        
    }
    public static void main(String[] args){
        Formas quadrado = new Quadrado(0);

        App.Info(quadrado);
        System.out.println(App.Info(quadrado));

    }
}
