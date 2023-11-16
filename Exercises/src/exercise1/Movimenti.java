package exercise1;

import java.util.Calendar;

public class Movimenti {

    private final Calendar data = Calendar.getInstance();
    private int importo;
    private String causale;
    private boolean esito;

    public Calendar getData(){
        return data;
    }
    public void setImporto(int importo){
        this.importo=importo;
    }
    public int getImporto(){ return importo; }
}