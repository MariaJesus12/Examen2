

package Model;

import java.util.HashMap;


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
        this.tipo = "C";
        this.tipo = "P";
        this.tipo = "A";
    }
    public void ContAuto(){
       int contP = 0;
       int contC = 0;
       int contA = 0;
        switch (this.tipo){
            case "Plataforma": 
               contP++;
            case "caja":
                contC++;
            case "Preferencial":
                contA++;
        }
    }
      HashMap<String, Integer>Tickets=new HashMap<>();
public void Agregar (){
 Tickets.put(this.tipo, Integer.getInteger(numero));
           }
public void Eliminar(){
    Tickets.clear();
}
public void Buscar(){
    Tickets.containsKey(this.tipo);
}
}
