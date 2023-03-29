package Salud;
import java.util.Scanner;;

public class Ejecucion {
    public static void main(String[] args) {

        Scanner captura=new Scanner(System.in);

        // crear un objeto :-> instancia de una clase

        Persona per = new Persona();  //el persona que esta depues del new(palabra reservada) es el metodo constructor de la clase persona
        // invocamos los metodo
        //nombre del objeto + nombre del metodo
        per.pedirDatos();
        per.mostrarPersona();
        per.Calcularlmc();
        per.mayorEdad();
        
      
    
        per.getNombre();
        per.getApellido();
        per.getTipoDoc();
        per.getDocumento();
        per.getPeso();
        per.getEstatura();
        per.getEdad();
        per.getSexo();


        
        String Cargo;
        String Departamento;
        double Valorhora;
        double HorasTrabajadas=0;
        double Totalpagar=0;
        double Reteica=(0.966*Totalpagar);
        
       
       

           System.out.println("Digite su Cargo");
           Cargo=captura.next();
           System.out.println("Digite su Departamento");
           Departamento=captura.next();
           System.out.println("Digite el valor por hora");
           Valorhora=captura.nextInt();
           System.out.println("Digite las Horas trabajadas");
           HorasTrabajadas=captura.nextDouble();

           // invocamos un metodo
    
               
    
           Empleado em=new Empleado(per.getNombre(), per.getApellido(),per.getTipoDoc(), per.getDocumento(), per.getPeso(),per.getEstatura(),per.getEdad(), per.getSexo(),Cargo, Departamento,HorasTrabajadas,Valorhora,Totalpagar);
           
           
           em.calcularHonorarios(Valorhora,HorasTrabajadas,Reteica,Totalpagar);
           em.mostrarEmpleado();
           
           }

        }

        
    
    
