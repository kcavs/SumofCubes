/** Kiersten Cavall
 * 9/9/24
 * it will ask for a number, then provide the sum of all the digets cubed  */
import java.util.*;
 public class SumofCubes{
    public static void main(String[] args){
        int num;
        Scanner input= new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        num= input.nextInt();
        input.close();
        int ans;
        ans=0;
        while(num>0){
            int x;
            x=num%10;
            ans+=(x*x*x);
            num=num/10;
        }
        System.out.println(ans);
    }
}