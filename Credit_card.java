/**
 * Programming coursework first year(first semester)
 * Islington College
 * 
 * @author 22066719 Jitendra Bhujel(N6)
 * @version:1.0
 */

public class Credit_card extends Bank_card
 {
    private int cvc_number;
    private double credit_limit;
    private double interest_rate;
    private String expiration_date;
    private int grace_period;
    private boolean is_granted;

    public Credit_card(int card_id, String client_name, String issuer_bank, String bank_account, int balance_amount, int cvc_number, double interest_rate, String expiration_date) 
    {
        super(balance_amount, card_id, bank_account, issuer_bank);
        setclient_name(client_name);
        this.cvc_number = cvc_number;
        this.interest_rate = interest_rate;
        this.expiration_date = expiration_date;
        is_granted = false;
    }

    //getters method
    
    public int getcvc_number()
     {
        return this.cvc_number;
    }

    public double getcredit_limit()
     {
        return this.credit_limit;
    }

    public double getinterest_rate()
     {
        return this.interest_rate;
    }

    public String getexpiration_date() 
    {
        return this.expiration_date;
    }

    public int getgrace_period() 
    {
        return this.grace_period;
    }

    public boolean getis_granted() 
    {
        return this.is_granted;
    }
    
        //setters method
    
    public void setcredit_limit(double credit_limit, int grace_period) 
    {
        if (credit_limit <= (super.getbalance_amount() * 2.5)) 
        {
            this.credit_limit = credit_limit;
            this.grace_period = grace_period;
            is_granted = true;
        } else 
        {
            System.out.println("Issuing Credit Card failed.");
            
        }
    }
    public void cancelCredit_card()
    {
        cvc_number = 0;
        credit_limit = 0;
        grace_period = 0;
        is_granted = false;
    }
            //display method
    public void display() 
    {
        super.display();
        if (is_granted) 
        {
            System.out.println("CVC number is: " + cvc_number);
            System.out.println("Credit limit is: " + credit_limit);
            System.out.println("Interest rate is: " + interest_rate);
            System.out.println("Expiration date is: " + expiration_date);
            System.out.println("Grace period is: " + grace_period);
        } else 
        {
            System.out.println("Credit card is not granted yet.");
        }
    }
}