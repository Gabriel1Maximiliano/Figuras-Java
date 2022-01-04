 
package funciones;

public class Cuadrado extends Rectangulo{
    
    private int lado;

    public Cuadrado(String color, Punto coordenadasPunto, String nombre,int lado) {
        super(color, coordenadasPunto, nombre);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
   
   
   
   public void perimetro(){
       System.out.println("perimetro del cuadrado = " + this.lado*4);
   }
    
    
}
