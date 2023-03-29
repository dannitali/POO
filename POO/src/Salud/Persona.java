package Salud;
import java.util.Scanner;

public class Persona {
    //ATRIBUTOS - regla es que todos sean privados

    
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private double  peso;
    private double estatura ;
    private int  edad;
    private String sexo;
  

    //METODOS -regla es que todos sean publicos
    // identiificador de acceso , valor de retorno (el void es cuanod no tiene valor, valor null) , nombre metodo
    public void pedirDatos(){
     
    Scanner captura=new Scanner (System.in);

    System.out.println("Digite su nombre : ");
    nombre = captura.next();

    System.out.println("Digite su Apellido: ");
    apellido=captura.next();

    System.out.println("Digite su Tipo de Documento : ");
    tipoDoc= captura.next();

    System.out.println("Digite su Documeno : ");
    documento=captura.nextInt();

    System.out.println("Digite su peso en kg : ");
    peso=captura.nextDouble();

    System.out.println("Digite su estatura en metros: ");
    estatura=captura.nextDouble();

    System.out.println("Digite su edad : ");
    edad=captura.nextInt();

    System.out.println("Digite su sexo : ");
    sexo=captura.next();

    captura.close();

    System.out.println("------------------------");


    }
    public void mostrarPersona(){
        System.out.println("La persona  " + nombre);
        System.out.println("de Apellido" + apellido);
        System.out.println("con tio de documento " + tipoDoc);
        System.out.println("el cual es " +  documento);
        System.out.println("tiene un peso de " + peso);
        System.out.println("su estatura es " + estatura);
        System.out.println("de edad " + edad);
        System.out.println("su sexo es " + sexo);

        System.out.println("------------------------");
        
    }

    
   public void Calcularlmc(){

   double pesoActual;

        pesoActual=peso/(estatura*estatura);

        if (pesoActual<20){
            System.out.println("El peso está por debajo de lo ideal");
        }
        else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("el peso es ideal");

        }
        else if (pesoActual>25){
            System.out.println("Usted tiene sobrepeso ");
        }
}

public void mayorEdad(){
    if (edad>18){
        System.out.println("Usted es mayor de edad");
    }
    else {
        System.out.println("Usted es menor de edad");
    }

}

//METODO CONSTRUCTOR VACIO CLASE PERSONA
public Persona(){

}
//METODO CONSTRUCTOR CON PARAMETROS CLASE PERSONA
public Persona(String nombre,String apellido, String tipoDoc,int documento, double  peso, double estatura, int edad, String sexo){
    this.nombre=nombre;
    this.apellido=apellido;
    this.tipoDoc=tipoDoc;
    this.documento=documento;
    this.peso=peso;
    this.estatura=estatura;
    this.edad=edad;
    this.sexo=sexo;

}

//ENCAPSULAMIENTO :

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}
public void setDocumento(int documento) {
    this.documento = documento;
}

public void setPeso(double peso) {
    this.peso = peso;
}
public void setEstatura(double estatura) {
    this.estatura = estatura;
}
public void setEdad(int edad) {
    this.edad = edad;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}


public String getNombre() {
    return nombre;
}
public String getApellido() {
    return apellido;
}
public String getTipoDoc() {
    return tipoDoc;
}
public int getDocumento() {
    return documento;
}

public double getPeso() {
    return peso;
}
public double getEstatura() {
    return estatura;
}
public int getEdad() {
    return edad;
}
public String getSexo() {
    return sexo;
}

}
