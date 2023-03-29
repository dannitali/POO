package FigurasGeometricas;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);

       
        int figura;

            System.out.println("Seleccione la figura a calcular 1.Cuadrado 2.Triangulo 3.Circulo 4.Rectangulo");

            figura=lectura.nextInt();

            switch (figura) {

                case 1:
                    Triangulo t1=new Triangulo();
                    float baseT;
                    float alturaT;
                    System.out.println("Escriba la base del triangulo");
                baseT= lectura.nextFloat();
                System.out.println("escriba la altura del triangulo");
                alturaT=lectura.nextFloat();
                

                    t1.setBase(baseT);
                    t1.setAltura(alturaT);
                    t1.calcularArea();

                    break;

                    case 2:
                   
                    Circulo C1= new Circulo();
                    float radio;
                    System.out.println("Escriba el radio del circulo");
                 radio= lectura.nextFloat();
                    C1.setRadio(radio);
                    C1.calcularArea();
                 break;

                 case 3:

                 Rectangulo R1= new Rectangulo();
                float base2;
                float altura2;
                System.out.println("Escriba la base del triangulo");
                base2= lectura.nextFloat();
                System.out.println("escriba la altura del triangulo");
                altura2=lectura.nextFloat();
            R1.setBase(base2);
            R1.setAltura(altura2);
            R1.calcularArea();

        break;
           
                default:
                    break;
            }

           

        }

        
        }




      
       
    
