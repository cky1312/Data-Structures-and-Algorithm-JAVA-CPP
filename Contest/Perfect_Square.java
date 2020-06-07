package GFG_Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Perfect_Square{
    static class FastReader{
        BufferedReader brr;
        StringTokenizer stt;
        public FastReader(){
            brr=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(stt==null || !stt.hasMoreElements()){
                try{
                    stt=new StringTokenizer(brr.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return stt.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
    }
    public static void main(String args[]){
        FastReader fast = new FastReader();

        int t=fast.nextInt();

        for(int i=0;i<t;i++){
            long n = fast.nextLong();
            long pre;
            long nex;

            if ((long)(Math.sqrt(n)) == Math.sqrt(n)){
                pre = ((long)Math.floor(Math.sqrt(n)))-1;
                nex = ((long)Math.floor(Math.sqrt(n)))+1;
            }
            else {
                pre = ((long)Math.floor(Math.sqrt(n)));
                nex = ((long)Math.floor(Math.sqrt(n)))+1;
            }
            System.out.println((n-(pre*pre)) <= Math.abs(n-(nex*nex))?(pre*pre):(nex*nex));
        }
    }
}



//import java.util.*;
//
//public class Perfect_Square {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no of test cases:");
//        int t = sc.nextInt();
//        while(t-- > 0){
//            System.out.println("Enter the number:");
//            int n = sc.nextInt();
//
//            getNearestPerfectSquare(n);
//        }
//
//    }
//    static void getNearestPerfectSquare(int n){
////        if(isPerfect(n)==true){
////            System.out.println(n);
////            return;
////        }
//
//        int n1=n-1,n2=n+1,belowN,aboveN;
//        while(true){
//            if(isPerfect(n1)){
//                belowN=n1;
//                break;
//            }
//            else
//                n1--;
//        }
//
//        while(true){
//            if(isPerfect(n2)){
//                aboveN=n2;
//                break;
//            }
//            else
//                n2++;
//        }
//        if((aboveN-n)>(n-belowN))
//            System.out.println(belowN);
//        else if((aboveN-n)==(n-belowN)){
//            System.out.println(Math.max(aboveN,belowN));
//        }
//        else
//            System.out.println(aboveN);
//
//    }
//    static boolean isPerfect(int n){
//        if((Math.sqrt(n) - Math.floor(Math.sqrt(n))) != 0 )
//            return false;
//        return true;
//    }
//}
