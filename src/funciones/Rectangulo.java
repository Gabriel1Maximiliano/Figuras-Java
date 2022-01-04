
package funciones;


public class Rectangulo extends Formas{
    
    private int ladoMayor;
    private int ladoMenor;

    public Rectangulo(String color, Punto coordenadasPunto, String nombre,int ladoMayor,int ladoMenor) {
        super(color, coordenadasPunto, nombre);
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
        
    }
     public Rectangulo(String color, Punto coordenadasPunto,String nombre){
         super(color,coordenadasPunto,nombre);
     }
    public int getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(int ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public int getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(int ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    @Override    public void Imprimir() {
        
    }

    
    
    @Override 
    public void obtenerColor() {
        System.out.println(" el color es " +super.getColor() );
       //System.out.println(" su color es " ); 
        
    }

    @Override
    public void moverForma(int x, int y) {
        super.getCoordenadasPunto().setCoordenadaX(x);
        super.getCoordenadasPunto().setCoordenadaY(y);
        System.out.println("las nuevas coordenadas son  " + super.getCoordenadasPunto());
        
    }

    @Override
    public void area() {
         System.out.println("el,area es  " + (ladoMayor*ladoMenor));
    }

    @Override
    public void perimetro() {
        
        System.out.println("el perimetro es "  + (2*ladoMayor + 2*ladoMenor));
    }

    @Override
    public void cambiarColor(String color) {
      
    super.setColor(color);
        
    
    
}
}
