import java.util.Scanner;
public class Third_largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int large=0;
        int second=0;
        int third=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                third=second;
                second=large;
                large=arr[i];
            }
        }
        System.out.println("Third largest element is: "+third);
    }
}
