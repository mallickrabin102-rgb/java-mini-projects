import java.util.Scanner;

class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int pin= 2580;
int EnterPin;
int count=0;


while (count<3) {
    System.out.println("Enter PIN :");
  EnterPin = sc.nextInt(); 
  if (pin==EnterPin) {
    System.out.println("Login Sucessfull!");
    break;
  } 
  else{
    count++;
  }
  if (count==3) {
    System.out.println("Card block!");
    sc.close();
    return;
  }
  else{
    System.out.println("Wrong PIN!"+  (3 - count) + " attempts left.");
  }
}    
        int balance = 10000;
        int choice = 0;
        do {
            System.out.println("=====ATM MENU=====");
            System.out.println("1.Blance Check:");
            System.out.println("2.Deposite:");
            System.out.println("3.Withdraw:");
            System.out.println("4.Exit:");
 System.out.println("Enter a choice:");
         choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Total Blance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposite:");
                    int amount = sc.nextInt();
                    balance += amount;
                    System.out.println("New blance "+balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    int wdthamount = sc.nextInt();
                    if (wdthamount > balance) {
                        System.out.println("Insuffent amount:");
                    } else {
                        balance -= wdthamount;
                        System.out.println("New Balance: " + balance);

                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invlide Choice!:");
                    break;
            }

        } while (choice != 4);
        sc.close();

    }
}
