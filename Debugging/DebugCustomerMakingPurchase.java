public class DebugCustomerMakingPurchase extends DebugCustomer
{
    double amountOfPurchase;
    boolean overLimit;

    DebugCustomerMakingPurchase(int id, String name, double credit, double purchAmount) {
        super(id, name, credit);
        amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit) {
           overLimit = true;
       }
       else{
          overLimit = false;
       }
    }

    @Override
    public void display()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
