import java.util.ArrayList;

// Todos los envíos incluidos en un combo postal deben tener 
//la misma ciudad de destino. 
public class Combo extends Envio {
    private ArrayList<Envio> envios;

    public Combo(int idTracking){
        super(idTracking);
        this.envios= new ArrayList<>();
    }

    public void addEnvio(Envio envio){
        if(envio.getDestinatario().getCiudad().equals(this.getDestinatario().getCiudad())){
            envios.add(envio);
            envio.setIdTracking(this.getIdTracking());
        }
    }

    public void setIdTracking(int idTracking){
        super.setIdTracking(idTracking);
        for(int i=0; i<envios.size();i++){
            envios.get(i).setIdTracking(idTracking);
        }
    }

    @Override
    public Persona getDestinatario() {
        if(envios.get(0)!=null){
       return envios.get(0).getDestinatario();
        }
        return null;
    }

    // public double getPeso(){
    //     for(int i=0;i<envios.size();i++){
            
    //     }
    // }








    
    
}
