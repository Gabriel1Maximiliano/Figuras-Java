
package funciones;


public abstract class Formas implements Iformas {
   private String color;
   private Punto coordenadasPunto;
   private String nombre; 

    public Formas(String color, Punto coordenadasPunto, String nombre) {
        this.color = color;
        this.coordenadasPunto = coordenadasPunto;
        this.nombre = nombre;
    }
   
   public abstract void Imprimir();
   
   public abstract void cambiarColor(String color);
   
   public abstract void obtenerColor();
   
   public abstract void area();
   
   public abstract void perimetro();
   
   
   
   public abstract void moverForma(int x , int y); 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCoordenadasPunto() {
        return coordenadasPunto;
    }

    public void setCoordenadasPunto(Punto coordenadasPunto) {
        this.coordenadasPunto = coordenadasPunto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" + "color=" + color + ", coordenadasPunto=" + coordenadasPunto + ", nombre=" + nombre + '}';
    }
   
   
    
}
