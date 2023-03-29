package FigurasGeometricas;
import java.util.Scanner;

public class Triangulo  extends Figura{
    private Scanner lectura= new Scanner(System.in);
    private float base, altura;

    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base =base;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }

    public void calcularArea(){
        System.out.println("Ingresa la base del triangulo");
        base=lectura.nextFloat();
       
        System.out.println("Ingrese la altura del triangulo");
        altura=lectura.nextFloat();

        float area= base*altura/2;
        System.out.println("La base del triangulo es "+this.base+" La altura es " + this.altura+ " el area es " + area);
    }
   
}
