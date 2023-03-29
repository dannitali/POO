package Salud;

public class Empleado extends Persona {

    private String Cargo;
    private String Departamento;
    private double Valorhora=0;
    private double HorasTrabajadas=0;
    public  double Totalpagar=0;
    public double reteica=(0.966*Totalpagar);

    //METODO CONSTRUCTOR DE LA SUBCLASE EMPLEADO

   public Empleado(String nombre, String apellido, String tipoDoc, int documento,  double peso, double estatura,
        int edad, String sexo, String Cargo,String Departamento, double horasTrabajadas , double Valorhora, double Totalpagar ) {

        //traemos el constructor de la clase padre : 

        super (nombre, apellido, tipoDoc, documento, peso, estatura, edad, sexo);
        
      
          this.Cargo=Cargo;
          this.Departamento=Departamento;
          this.Valorhora=Valorhora;
          this.HorasTrabajadas=horasTrabajadas;
          this.Totalpagar=Totalpagar;
            }


  
    public Empleado() {
    }

    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public double getValorhora() {
        return Valorhora;
    }
    public void setValorhora(double valorhora) {
        Valorhora = valorhora;
    }
    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }
        public double getTotalpagar() {
        return Totalpagar;
    }
    public void setTotalpagar(double totalpagar) {
        Totalpagar = totalpagar;
    }
        
    public int calcularHonorarios(double valorhora, double HorasTrabajadas, double reteica , double totalpagar){
        
        
        Totalpagar= (Valorhora * HorasTrabajadas)-reteica;

    return (int) Totalpagar;
        
    }  


    public void mostrarEmpleado(){
        System.out.println("\nSu Nombre es : " +getNombre() + "\nSu Apellido es : " +getApellido()+ "Su tipo de documento es : " +getTipoDoc()+ "\nEl Documento es : " +getDocumento()+ "\nSu cargo es: " +Cargo+ "\nSus Horas trabajadas son : " +HorasTrabajadas+ "\nSu Valor por hora es: " +Valorhora+ "\nSu total a pagar es: " +Totalpagar);

}
}

