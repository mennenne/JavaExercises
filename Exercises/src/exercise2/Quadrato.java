package exercise2;

public class Quadrato implements FormeGeometriche{
    private double lato;
    public Quadrato(double lato){
        this.lato=lato;
    }

    @Override
    public double area() {
        return lato*lato;
    }

    @Override
    public double perimetro() {
        return lato*4;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Quadrato)){
            return false;
        }
        Quadrato q1 = (Quadrato)obj;
        return this.lato==q1.lato;
    }

    @Override
    public int hashCode(){
        return (int)(lato*1000);
    }

    @Override
    public String toString(){
        return " "+lato;
    }
}