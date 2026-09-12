import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int [] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int Large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Large){
                Large=arr[i];
            }
        }

        System.out.println("Largest element is: "+Large);
    }
}