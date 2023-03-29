package Salud;
import java.util.Scanner;

public class Persona2 {

    //atributos 
    private double  peso;
    private double estatura ;

    //crear metodos 
    public void pedirDatos(){
    Scanner captura=new Scanner(System.in);

    System.out.println("Digite su peso en kg : ");
    peso=captura.nextDouble();
        
    System.out.println("Digite su estatura en metros: ");
    estatura=captura.nextDouble();
    }


    public void mostrarPersona(){
    System.out.println("tiene un peso de" + peso);
    System.out.println("su estatura es " + estatura);
    }

    //metodo con retorno (siempre lleva parametros)
    public double calcularImc (double peso, double estatura){
        
        double pesoActual;

        pesoActual=((peso)/(estatura * estatura));

        if (pesoActual<20){
            System.out.println(" tiene Pesobajo");
        }
        else if (pesoActual>=20 && pesoActual<=25){
            System.out.println(" el peso es ideal" );

        }
        else if (pesoActual>25){
            System.out.println("Usted tiene sobrepeso ");
        }

        return pesoActual;
        
    
}

}
