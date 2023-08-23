

package Model;


public class AdministrarTicket {
    private String numero;
    private String tipo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "C";
        this.tipo = "P";
        this.tipo = "A";
    }

    public AdministrarTicket(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    
}
