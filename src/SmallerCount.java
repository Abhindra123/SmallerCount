import java.util.Scanner;

public class SmallerCount {
    public static int [] smallerCount(int arr[]){
        int ans[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count=count+1;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

            int ans[]=smallerCount(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}