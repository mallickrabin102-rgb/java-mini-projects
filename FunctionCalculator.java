 import java.util.Scanner;
 class FunctionCalculator {
    static int add(int a,int b){
return a+b;
    }
    static int subtract(int a,int b){
return a-b;
    }
static int multiply(int a,int b){
return a*b;
    }
static float divide(int a,int b){
if (b==0) {
    System.out.println("Error!");
    return 0;
}
else{
    return (float) a/b;
}
}

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter A:");
int a = sc.nextInt();
System.out.println("Enter B:");
int b = sc.nextInt();
System.out.println("The addition is = "+add(a, b));
System.out.println("The subtraction is = "+subtract(a, b));
System.out.println("The multiply is = "+multiply(a, b));
System.out.println("The divide is = "+divide(a, b));
sc.close();
    }
}
