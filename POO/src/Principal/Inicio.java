package Principal;
import Salud.Persona;
import Salud.Persona2;

public class Inicio {

    public static void main(String [] args){

        
        Persona per = new Persona();

        per.pedirDatos();
        per.mostrarPersona();
        per.Calcularlmc();
        per.mayorEdad();


        Persona2 pe = new Persona2();
        pe.calcularImc(0, 0);

        
    }
    
}
