import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner sc = new Scanner(System.in);

        int choice;
        double amount;
        String category;
        String description;

        while (true)
        {
            System.out.print("\nSelect any option belows:\n"+"1. Add Expense"+"\n2. View Expense"+"\n3. Show Total"+"\n4. Exit"+"\nEnter your choice ->");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.print("Enter the amount= ");
                    amount = sc.nextDouble();
                    System.out.print("Enter the category= ");
                    sc.nextLine();
                    category = sc.nextLine();
                    System.out.print("Enter the description= ");
                    description = sc.nextLine();
                    expenseTracker.addExpense(amount,category,description);
                    break;
                }
                case 2:
                    expenseTracker.viewExpense();
                    break;
                case 3:
                    System.out.println("Total Expense: "+expenseTracker.getTotalExpense());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter valid option");
            }
        }

    }
}