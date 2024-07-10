public class Perimetro implements Figura {
       
    //Atributos del Perimetro
     private double Longitud;
     private double Anchura;

     public Perimetro(){

     }
     //Constructores del perimetro
     public Perimetro(double Longitud, double Anchura){
     this.Longitud = Longitud;
     this.Anchura = Anchura;
     }

    @Override
    public double Area() {
       double resultado = 2 * (Longitud + Anchura);
          return resultado;
    }

}
