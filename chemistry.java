import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int[] arr=new int[26];
            for(int i=0;i<n;i++){
                char a=s.charAt(i);
                arr[a-'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++){
                if(arr[i]%2!=0){
                    count++;
                }
            }
            if(k<count-1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
