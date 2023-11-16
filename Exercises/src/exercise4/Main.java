package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int ricerca(int[]array, int target){
        int min=0;
        int max= array.length-1;
        int pmedia=0;
        while(min<=max){
            pmedia=(min+max)/2;
            if (array[pmedia]==target){
                return pmedia;
            }
            if(array[pmedia]<target){
                min=pmedia+1;
            }else{
                max=pmedia-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={9,5,50,4};
        for(int i=0; i< array.length; i++){
            for (int j=0; j< array.length; j++){
                if(array[i]<array[j]){
                    int n=array[i];
                    array[i]=array[j];
                    array[j]=n;
                }
            }
        }
        for (int n: array) {
            System.out.println(n);

        }
        int somma=0;
        System.out.println(array[array.length-1]);
        System.out.println(array[0]);
        for (int i=0; i< array.length; i++){
            somma+= array[i];
        }
        System.out.println(somma);
        System.out.println(somma/ array.length);

        int target=9;
        System.out.println(ricerca(array,target));

        String[] arrayDiStringhe = {"casa","topo","casa"};
        List<String> stringList = new ArrayList<>();
        for (String str: arrayDiStringhe) {
            if(!stringList.contains(str)){
                stringList.add(str);
            }
        }
        int[] counters = new int[stringList.size()];

        for (int i=0; i<stringList.size(); i++){
            String str= stringList.get(i);
            for (int j=0; j<arrayDiStringhe.length; j++){
                if (str.equals(arrayDiStringhe[j])){
                    counters[i]++;
                }
            }
        }

        for (int n:counters) {
            System.out.println("Il numero di occorrenze è di "+n);
        }

        String[] stringhe = {"Cane", "Gatto", "Topo"};
        int[] interi = new int[stringhe.length];
        int n=0;
        for (int i=0; i< stringhe.length; i++){
            interi[i] = stringhe[i].length();
            n+=interi[i];
        }
        System.out.println("La media è "+n/interi.length);
        String str;
        for (int i=0; i< stringhe.length; i++){

            List<Character> cList = new ArrayList<>();
            for (int k2=0; k2<stringhe[i].length(); k2++) {
                char c=stringhe[i].charAt(k2);
                if(!cList.contains(c)){
                    cList.add(c);
                }
            }
            int[] counters1 = new int[cList.size()];
            for (int k1=0; k1<counters1.length; k1++){
                counters1[k1]=0;
            }

            for (int k=0; k<cList.size(); k++){
                char c= cList.get(k);
                for (int j=0; j<stringhe[i].length(); j++){
                    if (c==(stringhe[i].charAt(j))){
                        counters1[i]++;
                    }
                }
            }
            for (int couter:counters1) {
                System.out.println(couter);
            }
            System.out.println("------");
        }
    }
}