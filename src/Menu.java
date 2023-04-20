
import java.util.Scanner;


public class Menu {
    Scanner entrada = new Scanner(System.in);
    Usuario U1 = new Usuario();
    public void mostrarMenu(){

        int opcion;
        System.out.println("--------Banco Ficticio 1--------"
                + "\n"
                + "\nElige una opcion"
                + "\n1)Registro cliente");
        opcion = entrada.nextInt();
        switch(opcion){
            
            case 1:
                    U1.ingresoUsuario();
                    
                    U1.getNombre();
                    break;
            
        }
        
    }
    
}
