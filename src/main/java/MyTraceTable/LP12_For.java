package MyTraceTable;

public class LP12_For {
    public static void main(String [] args){
        int num = 4;
        int fat = 1;
        System.out.println(num + "," + fat);
        for (int k=1; k<=num; k++){
            fat = fat*k;
            System.out.println(num + "," + fat + "," + k);
        }
    }
}
