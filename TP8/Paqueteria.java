public class Paqueteria extends Envio{
    private Persona destinatario;
    private Persona remitente;
    private boolean retiroSucursal;
    private double peso;

    public Paqueteria(int idTracking, Persona destinatario, Persona remitente, boolean retiroSucursal, double peso) {
        super(idTracking);
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.retiroSucursal = retiroSucursal;
        this.peso = peso;
    }

    

    public Persona getDestinatario() {
        return destinatario;
    }



    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }



    public Persona getRemitente() {
        return remitente;
    }



    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }



    public boolean isRetiroSucursal() {
        return retiroSucursal;
    }

    public void setRetiroSucursal(boolean retiroSucursal) {
        this.retiroSucursal = retiroSucursal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    


    
}
