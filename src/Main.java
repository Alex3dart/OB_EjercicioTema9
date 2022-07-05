

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setTelefono(123456789);
        cliente.setNombre("Juan");
        cliente.setCredito(100);

        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("La edad del cliente es: " + cliente.getEdad());
        System.out.println("El telefono del cliente es: "+ cliente.getTelefono());
        System.out.println("El credito del cliente es: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(20000);
        System.out.println("El salario del trabajador es: "+ trabajador.getSalario());


    }

}

class Persona {

    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }

}

class Cliente extends Persona{
    int credito;
    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return credito;
    }
}
class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }
}