import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long x=sc.nextLong();
            long min=0;
            for(int i=1;i<=k;i++){
                min+=i;
            }
            long max=0;
            for(int i=n;k>0;k--,i--){
                max+=i;
            }
            if(min>x){
                System.out.println("NO");
            }
            else if(max<x){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
