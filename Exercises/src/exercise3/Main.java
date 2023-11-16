package exercise3;

public class Main {
    public static void main(String[] args){

        String[] array = new String[3];
        Stringhe stringa1 = new Stringhe(array);
        array[0]="Casa";
        array[1]="Home";
        array[2]="House";
        String[] invertito= stringa1.invertiOrdine();
        for (String inverso: invertito) {

            System.out.println(inverso);
        }
    }
}