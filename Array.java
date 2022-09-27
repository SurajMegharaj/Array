import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print(scan.nextInt());
        }
        addi(arr);

    }

    public static void addi(int[] std){

        int sum=0;
        for (int i=0;i<std.length;i++){
            sum = std[i]+sum;
        }
        System.out.println(sum);


    }
}
