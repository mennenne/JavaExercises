package exercise2;

public class Main {

    public static void main(String[] args){

        Quadrato q1= new Quadrato(20);
        Quadrato q2= new Quadrato(20);

        System.out.println(q1.equals(q2));
        System.out.println(q1.hashCode());
        System.out.println(q2.hashCode());
        System.out.println(q1.hashCode()==q2.hashCode());
    }
}