package exercise2;
import java.lang.Math;
public class Cerchio implements FormeGeometriche{

    private double raggio;

    public Cerchio(double raggio){
        this.raggio=raggio;
    }
    @Override
    public double area() {
        return Math.PI*raggio*raggio;
    }

    @Override
    public double perimetro() {
        return Math.PI*raggio*2;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj==this){
            return true;
        }
        if(! (obj instanceof Cerchio)){
            return false;
        }
        Cerchio c1 = (Cerchio) obj;
        return c1.raggio==this.raggio;
    }

    @Override
    public String toString(){
        return ""+raggio;
    }
}