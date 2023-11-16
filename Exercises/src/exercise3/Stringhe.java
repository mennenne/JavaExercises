package exercise3;

public class Stringhe {
    private String[] array;

    public Stringhe(String[] array){
        this.array=array;
    }

    public String[] invertiOrdine(){
        String[] output = new String[array.length];
        for (int j=0; j< array.length; j++) {
            String str= array[j];
            String tmp = "";
            for (int i=str.length()-1; i>=0; i--){
                char c = str.charAt(i);
                tmp+= c;
            }
            output[j]=tmp;
        }
        return output;
    }
}