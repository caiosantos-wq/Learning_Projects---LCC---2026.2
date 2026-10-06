package MyTraceTable;

public class LP12_While {
    public static void main(String [] args){
        int max = 2;
        int soma = 0;
        int k = 0;
        System.out.println(max + "," + soma + "," + k);
        while (k<=max){
            soma+=k;
            k+=1;
            System.out.println(max + "," + soma + "," + k);
        }
    }
}
