import java.util.*;
public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int count = 0;
            int[] arr1={-a,-a,a,a,b,b,-b,-b};
            int[] arr2={b,-b,b,-b,a,-a,a,-a};
            if(a==b){
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        int p=x1+arr1[i];
                        int q=y1+arr2[i];
                        int r=x2+arr1[j];
                        int s=y2+arr2[j];
                        if(p==r && q==s){
                            count++;
                        }
                    }
                }
            }
            else{
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        int p=x1+arr1[i];
                        int q=y1+arr2[i];
                        int r=x2+arr1[j];
                        int s=y2+arr2[j];
                        if(p==r && q==s){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
