
/**
 * TicketMachine program
 *
 * @author Muhammad Zahran
 * @version 2025.09.09
 */
public class TicketMachine
{
    private int price; // The price of a ticket
    
    private int balance; // The cutomer's entered money
    
    private int total; // The total amount of money collected
    
    public TicketMachine(int cost) 
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    public int getPrice()
    {
        return price; // Return the ticket's price
    }
    
    public int getBalance()
    {
        return balance; // Return the amount of money inserted
    }
    
    public void insertMoney(int amount) // Insert money
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
            amount);
        
        }
    }
    
    public void printTicket() // Print the ticket
    {
        if(balance >= price) 
        {
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("The BlueJ Line");
            System.out.println("   #Ticket#   ");
            System.out.println(""+ price + " cents");
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println();
            
            total = total + price;
            
            balance = balance - price;
        } 
        else 
        {
            System.out.println("Insufficient balance, you need " + 
                                (price-balance) +" cents more");
        }
    }
    
    public int refundBalance() // Return the money in balance
    {
        int refundAmount;
        refundAmount = balance;
        balance = 0;
        return refundAmount;
    }
}
