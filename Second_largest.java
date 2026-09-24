import java.util.Scanner;
public class Second_largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int largest=0;
        int sec_large=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                sec_large=largest;
                largest=arr[i];
            }
        }
        System.out.println(sec_large);
    }
}
