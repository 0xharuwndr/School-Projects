import java.util.Scanner;
public class RunAmountDue {
    	public static void main(String[] args) {
    	    Scanner rvn = new Scanner(System.in);
    	    AmountDue due = new AmountDue();
            
            
    	    System.out.println("Press any of the following the enter values seperated by SPACES: ");
    	    System.out.println("1. Price Only");
    	    System.out.println("2. Price and Quantity");
    	    System.out.println("3. Price, Quantity, and Discount");
    	    System.out.println("================================");
    	   
    	    int choice = rvn.nextInt();
    	    double amountDue = 0.0;
 
    	    switch (choice) {
                case 1:
                    System.out.println("Enter Amount");
                    double p = rvn.nextDouble();
                    amountDue = due.ComputeAmountDue(p);
                    break;
                    
                case 2:
                    System.out.println("Enter Amount and Quantity");
                    double price2 = rvn.nextDouble();
                    int qty2 = rvn.nextInt();
                    amountDue = due.ComputeAmountDue(price2, qty2);
                    break;
                case 3:
                    System.out.println("Enter Amount, Quantity, and Discount");
                    double price3 = rvn.nextDouble();
                    int qty3 = rvn.nextInt();
                    double disc3 = rvn.nextDouble();
                    amountDue = due.ComputeAmountDue(price3, qty3, disc3);
                    
                    break;

                default:
                    System.out.println("Invalid Input");  
                    rvn.close();
                    return;
            }
            System.out.print("The computed amount due is " + amountDue);
    	}
    }