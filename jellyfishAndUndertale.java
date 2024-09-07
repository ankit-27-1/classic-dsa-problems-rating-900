import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long sum=b;
            for(int i=0;i<n;i++){
                sum += Math.min(1L + arr[i], 1L * a) - 1;
            }
            System.out.println(sum);
        }
    }
}
