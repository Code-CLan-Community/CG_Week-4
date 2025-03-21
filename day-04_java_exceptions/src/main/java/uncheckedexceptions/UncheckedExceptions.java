package uncheckedexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        try{
            int a=3,b;
            Scanner sc=new Scanner(System.in);
            b=sc.nextInt();
            System.out.println(b);
            b=0;
            int c=a/b;
            System.out.println(c);



        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception");
        }
    }

}

