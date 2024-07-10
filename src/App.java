

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora!");

       Longitud longitud = new Longitud(5, 3);
       Perimetro perimetro = new Perimetro(5, 3);

       System.out.println("El area del rectangulo es: " + longitud.Area());
       System.out.println("El perimetro de un rectangulo es: " + perimetro.Area());
    }
}
