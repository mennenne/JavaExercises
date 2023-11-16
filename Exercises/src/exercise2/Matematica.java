package exercise2;

import java.util.ArrayList;

public class Matematica {
    private FormeGeometriche[] array;
    private int contatore;
    public Matematica(int dimensione){
        array = new FormeGeometriche[dimensione];
        contatore=0;
    }

    public boolean aggiungiFigura(FormeGeometriche forma){
        if (forma == null){
            return false;
        }
        if(contatore>= array.length){
            return false;
        }
        array[contatore]=forma;
        contatore++;
        return true;
    }

    public void stampaCalcoloPuntuale(FormeGeometriche forma){
        for(int i=0; i<contatore; i++){
            System.out.println(array[i].perimetro());
            System.out.println(array[i].area());
        }
    }

    public void sommaAreaPerimetro(){
        double area=0, perimetro=0;
        for (int i=0; i<contatore; i++){
            area+=array[i].area();
            perimetro+=array[i].perimetro();
        }
        System.out.println("La somma delle aree è: " + area);
        System.out.println("La somma dei perimetri è: " + perimetro);
    }

    public boolean mediaAreaPerimetro(){
        if(contatore==0){
            return false;
        }
        double area=0, perimetro=0;
        for (int i=0; i<contatore; i++){
            area+=array[i].area();
            perimetro+=array[i].perimetro();
        }
        area/=contatore;
        perimetro/=contatore;
        System.out.println("La media delle aree è: " + area);
        System.out.println("La media dei perimetri è: " + perimetro);
        return true;
    }
}