
package funciones;


public class APP {
    public static void main(String[] args) {
        Rectangulo formas1 = new Cuadrado("rojo",new Punto(2,3),"cuadrado", 2);
        //formas1.perimetro();
        formas1=new Rectangulo("rojo", new Punto(3,5),"rectangulo" , 8, 9);
    Formas formas2 = new Rectangulo("verde", new Punto (1,2),"rectangulo",3,5);
    //formas2.perimetro();
    Formas formas[]=new Formas[2];
    formas[0]=formas1;
    formas[1]=formas2;
    for(Formas elemento:formas){
        elemento.cambiarColor("verde");
        elemento.obtenerColor();
    }
}
}