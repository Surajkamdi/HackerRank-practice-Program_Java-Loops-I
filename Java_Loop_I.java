import java.io.*;
import java.util.*;

public class Java_Loop_I {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        if(num>=2 && num <=20){
            for(int i=1;i<=10;i++){
                int mul = num*i;
                System.out.println(num+" x "+ i+" = "+mul);
                // Code written by Er. Suraj kamdi
                //
            }
        }
    }
}
