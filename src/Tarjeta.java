
import java.util.*  ;


public class Tarjeta {
    Usuario u1 = new Usuario();
    Scanner entrada = new Scanner(System.in);
    private int numero;
    private String nombreBanco;
    private String nombreCliente;
    private int codigoSeguridad;
    private String fechaEmision;
    private String emisor;
    private String fechaVencimiento;

    public Tarjeta(int numero, String nombreBanco, int codigoSeguridad, String fechaEmision, String emisor, String fechaVencimiento) {
        this.numero = numero;
        this.nombreCliente = u1.getNombre();
        this.nombreBanco = nombreBanco;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaEmision = fechaEmision;
        this.emisor = emisor;
        this.fechaVencimiento = fechaVencimiento;
    }
    
         
    public String getNombreCliente(){
        
        return nombreCliente;
    }

    

    public int getNumero() {
        return numero;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
        
}
