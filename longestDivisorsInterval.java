import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            int count=0;
            for(long i=1;i<100;i++){
                if(n%i==0){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
