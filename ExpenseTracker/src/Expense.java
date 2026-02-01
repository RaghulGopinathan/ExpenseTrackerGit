/*
 Expense
- amount
- category
- description
 */
public class Expense {
    private double amount;
    private String category;
    private String description;

    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getAmount()
    {
        return this.amount;
    }
    public String getCategory(){
        return this.category;
    }
    public String getDescription(){
        return this.description;
    }
}
