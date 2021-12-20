package Entities;

public class Customer {
    private String name;
    private float amountBought;
    private float moneySpent;

    public String getName()
    {
        return this.name;
    }

    public float getAmountBought()
    {
        return this.amountBought;
    }

    public float getMoneySpent()
    {
        return this.moneySpent;
    }

    public Customer(String name)
    {
        this.name = name;
        this.moneySpent = 0;
        this.amountBought = 0;
    }

    public String ShowData()
    {
        return "Name: " + this.getName() + "\n Has bought at the moment: " + this.getAmountBought() + "\n Has spent at the moment: " + this.getMoneySpent();
    }

    public void BuyOranges(float amount, float price)
    {
        this.moneySpent = this.getMoneySpent() + price;
        this.amountBought = this.getAmountBought() + amount;
    }
}
