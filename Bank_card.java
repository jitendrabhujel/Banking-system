
/**
 * Programming coursework first year (first semester)
 *Islington college
 * @author 22066719 Jitendra Bhujel(N6)
 * @version (1.0)
 */
public class Bank_card
{
    private String client_name;
    private String issuer_bank;
    private int balance_amount;
    private String bank_account;
    private int card_id;
    
    
  public Bank_card(int balance_amount,int card_id, String bank_account, String issuer_bank)
  {
      this.card_id=card_id;
      this.issuer_bank=issuer_bank;
      this.balance_amount=balance_amount;
      this.bank_account=bank_account;
      this.client_name= "";
     
  }
             
              //getters method
  public int getcard_id()
  {
      return this.card_id;
  }
  public String getissuer_bank()
  {
      return this.issuer_bank;
  }
  public String getclient_name()
  {
      return this.client_name;
  }
  public int getbalance_amount()
  {
      return this.balance_amount;
  }
  public String getbank_account()
  {
      return this.bank_account;
  }
  
         //setters method
  public void setclient_name(String client_name)
  {
      this.client_name=client_name;
  }
  public void setbalance_amount(int balance_amount)
  {
      this.balance_amount=balance_amount;
  }
  //display method
  public void display()
  {
      System.out.println("card id is"+ card_id);
      System.out.println(" issuer bank is"+ issuer_bank);
      System.out.println(" bank account is"+ bank_account);
      System.out.println(" balance amount is"+ balance_amount);
      if(client_name ==" ")
      {
          System.out.println("client_name is not assigned");
        }
          else
          {
            System.out.println(client_name);  
            }
      }
  
  
  
  
}    