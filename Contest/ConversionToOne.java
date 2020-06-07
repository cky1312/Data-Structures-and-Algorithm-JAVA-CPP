package GFG_Contest;

import java.util.*;
//public class ConversionToOne {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of test cases:");
//        int t = sc.nextInt();
//        while(t-- > 0){
//            System.out.println("Enter the number:");
//            int n = sc.nextInt();
//            int count = 0;
//            while(n > 1){
//                if(n%2 == 0)
//                    n /= 2;
//                else{
//                    if(n<=0)
//                        n += 1;
//                    else
//                        n -= 1;
//                }
//                count++;
//            }
//            System.out.println(count);
//        }
//    }
//}
class gf{
    static long way(long n){
        if(n==1)
            return 0;
        else if(n%2==0)
            return 1+way(n/2);
        else
            return 1+Math.min(way(n-1),way(n+1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(way(n));
        }
    }
}