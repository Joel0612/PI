public class Longitud implements Figura {
 
     //Variable del area
    private double Longitud;
    private double Anchura;

    public Longitud (){

    }
    //cONSTRUCTORES 
    public Longitud(double Longitud, double Anchura){
      this.Longitud = Longitud;
      this.Anchura = Anchura;
    }

    @Override
    public double Area() {
        double resultado = Longitud * Anchura;
        return resultado;
    }
}
