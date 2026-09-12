import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

         int num=sc.nextInt();

        int [] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }

        System.out.println("Smallest element is: "+small);
    }
}
