import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Random rand = new Random();
int secret = rand.nextInt(100)+1;
System.out.println("Enter a number between 1 to 100");
int tries = 0;
while (true) {
int num = sc.nextInt();
        tries++;

    if (num>secret) {
        System.out.println("Too high");
    }else if (num<secret) {
        System.out.println("Too low");

    }else{
        System.out.println("You win in "+tries +" tries!");
        break;

    }
}
    sc.close();



    }
}
