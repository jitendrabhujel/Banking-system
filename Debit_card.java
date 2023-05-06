/**
 *Programming coursework First year(first semester)
 * Islington College
 * @author 22066719 Jitendra Bhujel(N6)
 * @version (1.0)
 */

   class Debit_card extends Bank_card {
    private int pin_number;
    private int withdrawal_amount;
    private String date_of_withdrawal;
    private boolean has_withdrawn;

    public Debit_card(int balance_amount, int card_id, String bank_account, String issuer_bank, String client_name, int pin_number)
    {
        super(balance_amount,card_id, bank_account, issuer_bank);
        this.pin_number = pin_number;
        this.has_withdrawn = false;
    }

    // getters methods
    public int getpin_number()
    {
        return this.pin_number;
    }

    public int getwithdrawal_amount() 
    {
        return this.withdrawal_amount;
    }

    public String getDate_of_withdrawal() 
    {
        return this.date_of_withdrawal;
    }

    public boolean gethas_withdrawn()
    {
        return this.has_withdrawn;
    }

    // setters method
    public void setwithdrawal_amount(int withdrawal_amount)
    {
        this.withdrawal_amount = withdrawal_amount;
    }

    public void withdraw(int withdrawal_amount, String date_of_withdrawal, int pin_number)
    {
        if (pin_number == pin_number) 
        {
            if (withdrawal_amount <= super.getbalance_amount()) 
            {
                super.setbalance_amount(super.getbalance_amount() - withdrawal_amount);
                this.withdrawal_amount = withdrawal_amount;
                this.date_of_withdrawal = date_of_withdrawal;
                this.has_withdrawn = true;
                System.out.println("Withdrawal successfully");
            } 
            else
            {
                System.out.println("Insufficient balance.");
            }
        } 
        else
        {
            System.out.println("Invalid PIN.");
        }
    }
            //display method
    public void display()
    {
        super.display();
        System.out.println("PIN: " + pin_number);
        if (has_withdrawn)
        {
            System.out.println("Withdrawal Amount is: " + withdrawal_amount);
            System.out.println("Date of Withdrawal: " + date_of_withdrawal);
        } 
        else
        {
            System.out.println("Transaction failed");
        }
    }
}
