
package even.numbers;
import java.util.Scanner;
public class EvenNumbers {

    
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scan.nextInt();
        System.out.println("Even numbers: ");
        for (int i = 0; i <= number; i++) {
            if(i%2==0){
                System.out.println(i);}
        }

    }
    
}
