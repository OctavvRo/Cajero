
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Usuario {
    
     private String nombre;
     private String apellido;
     private String direccion;
     private int DNI;
     private LocalDate fechaNacimiento;
     Scanner entrada = new Scanner(System.in);
     
     public void ingresoUsuario() {
         String fecha;
         System.out.println("Ingresa el nombre del cliente: ");
         nombre= entrada.nextLine();
         System.out.println("Ingrese el apellido: ");
         apellido = entrada.nextLine();
         System.out.println("Ingrese su fecha de nacimiento: ");
         fecha = entrada.nextLine();
         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         this.fechaNacimiento = LocalDate.parse(fecha, f);
         
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

   
 

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    
     
     
    
    
     
}


