
import java.util.Date;
import java.util.Scanner;


public class Menu {
    Scanner entrada = new Scanner(System.in);
    Usuario U1 = new Usuario();
    Tarjeta T1 = new Tarjeta(1234567891,"Santander",355,"14/03/2014","Visa","14/03/2015");
    public void mostrarMenu(){

        int opcion;
        do{
        System.out.println("--------Banco Ficticio 1--------"
                + "\n"
                + "\nElige una opcion"
                + "\n1)Registro cliente"
                + "\n2)Tarjeta"
                + "\n5)Salir");
        opcion = entrada.nextInt();
        switch(opcion){
            
            case 1:
                    U1.ingresoUsuario();
                    U1.getNombre();
                    System.out.println("fecha "+U1.getFechaNacimiento());

                    break;
            case 2: 
                    System.out.println("Datos de la tarjeta de débito: \n");
                   System.out.println("Propietario: "+T1.getNombreCliente());
                   System.out.println("\nNúmero tarjeta: "+T1.getNumero());
                   
        }}while(opcion!=5);
         
   
    }
    
}
