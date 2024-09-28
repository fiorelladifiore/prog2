public abstract class Envio{
    private int idTracking;

    public Envio(int idTracking) {
        this.idTracking = idTracking;
    }

    public int getIdTracking() {
        return idTracking;
    }

    public void setIdTracking(int idTracking) {
        this.idTracking = idTracking;
    }

    public abstract Persona getDestinatario();

 
    

    
}