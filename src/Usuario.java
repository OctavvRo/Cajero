
import java.util.Date;
import java.util.Scanner;

public class Usuario {
    
     private String nombre;
     private String apellido;
     private String direccion;
     private int DNI;
     private String fechaIngresada;
     private Date fecha;
     
     Scanner entrada = new Scanner(System.in);
     
     public void ingresoUsuario() {
         System.out.println("Ingresa el nombre del cliente: ");
         nombre= entrada.nextLine();
         System.out.println("Ingrese el apellido: ");
         apellido = entrada.nextLine();
         System.out.println("Ingrese su fecha de nacimiento: ");
         fechaIngresada = entrada.nextLine();
         System.out.println("Ingrese su direccion: ");
         direccion = entrada.nextLine();
         System.out.println("Ingrese su dni: ");
         DNI = entrada.nextInt();
         
            
         
     }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public String getFechaIngresada() {
        return fechaIngresada;
    }

    public Date getFecha() {
        return fecha;
    }

    
     
     
    
    
     
}


