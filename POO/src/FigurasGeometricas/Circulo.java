package FigurasGeometricas;
import java.util.Scanner;
public class Circulo extends figura {
    Scanner lec=new Scanner(System.in);

    private double radio;

    //metodo constructor 
    public Circulo(double radio) {
        this.radio = radio;
    }

    //metodos accesores 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos propios (es el metodo abstracto)

    public void calcularArea() {
        double area;
        double pi=3.1416;
        System.out.println("Por Favor digite  el radio del circulo");
        radio=lec.nextFloat();
        area=pi*(radio*radio);

        System.out.println("El area del circulo es : " +area);
    }

    
}