/*
ExpenseTracker
- ArrayList<Expense>
- addExpense()
- viewExpenses()
- getTotal()
 */

import java.util.ArrayList;

public class ExpenseTracker{


    ArrayList<Expense> arrList = new ArrayList<Expense>();
    double totalExpense;

    public void addExpense(double amount, String category, String description){
        Expense expenseObj = new Expense();
        expenseObj.setAmount(amount);
        expenseObj.setCategory(category);
        expenseObj.setDescription(description);

        arrList.add(expenseObj);
        totalExpense+= expenseObj.getAmount();
    }

    public void viewExpense()
    {
        for (Expense x : arrList)
        {
            System.out.println("Amount: "+x.getAmount() +"\nCategory: "+x.getCategory()+"\nDescription: "+x.getDescription()+"\n");
        }

    }

    public double getTotalExpense(){
        return totalExpense;
    }
}
