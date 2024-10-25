import java.util.ArrayList;

public class Producto extends ElementoElec{
    private int valor;
    private int cantStock;
    private ArrayList<String> palabras;

    public Producto(String nombre, int valor, int cantStock) {
        super(nombre);
        this.valor = valor;
        this.cantStock=cantStock;
        palabras= new ArrayList<String>();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    

    

    
}
