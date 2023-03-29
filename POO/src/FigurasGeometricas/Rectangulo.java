package FigurasGeometricas;
import java.util.Scanner;

public class Rectangulo extends Figura {

 Scanner lectura= new Scanner(System.in);
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
    System.out.println("Ingresa la base del rectangulo");
    base=lectura.nextFloat();
   
    System.out.println("Ingrese la altura del rectangulo");
    altura=lectura.nextFloat();

    float area= base*altura;
    System.out.println("La base del rectangulo es "+this.base+" La altura es " + this.altura+ " el area es " + area);
}

}

