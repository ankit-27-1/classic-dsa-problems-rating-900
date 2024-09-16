import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=1;
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++){
                int count=1;
                while(i<n-1 && arr[i+1]-arr[i]<=k){
                    count++;
                    i++;
                }
                if(count>max){
                    max=count;
                }
            }
            System.out.println(n-max);
        }
    }
}
