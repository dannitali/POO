package Interfaz;
import java.util.Scanner;
import java.util.Random;

public class Piedrapapeltijera {

    //atributos
    private String nombre;
    private String opciones;
    private int maquina;


       //creamos el objeto de las clases

        Random random = new Random();
        Scanner jueg = new Scanner(System.in);

       //solicitamos los datos

       //creamos el metodo incio el cual sera publico y no tendra retorno 
       public void inicio() {     

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");
        System.out.print("Digite su nombre");
        nombre=jueg.next();
       }
        

        public void jugar(){

        maquina = random.nextInt(3); // Se genera un numero aleatorio entre 0 , 1 y  2
        System.out.println("Juega piedra, papel o tijera: ");
        opciones = jueg.next();
        }



        public void finalizar(){

            switch(opciones) {
                case "piedra":
                    if (maquina == 0) {
                        System.out.println("La máquina eligió piedra. ¡Empate!");
                    } else if (maquina == 1) {
                        System.out.println("La máquina eligió papel. ¡Perdiste!");
                    } else {
                        System.out.println("La máquina eligió tijera. ¡Ganaste!");
                    }
                    break;
                case "papel":
                    if (maquina == 0) {
                        System.out.println("La máquina eligió piedra. ¡Ganaste!");
                    } else if (maquina == 1) {
                        System.out.println("La máquina eligió papel. ¡Empate!");
                    } else {
                        System.out.println("La máquina eligió tijera. ¡Perdiste!");
                        
                    }
                    break;
                case "tijera":
                    if (maquina == 0) {
                        System.out.println("La máquina eligió piedra. ¡Perdiste!");
                    } else if (maquina == 1) {
                        System.out.println("La máquina eligió papel. ¡Ganaste!");
                    } else {
                        System.out.println("La máquina eligió tijera. ¡Empate!");
                    }
                    break;
                    default:
                    System.out.println("Su opcion es inválida.");
                    break;
              
        }
        
      }

    }

        
    
