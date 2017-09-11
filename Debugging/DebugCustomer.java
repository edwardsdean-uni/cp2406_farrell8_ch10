public class DebugCustomer {
    int idNumber;
    String name;
    double creditLimit;

    public DebugCustomer(int id, String name, double credit) {
       idNumber = id;
       this.name = name;
       creditLimit = credit;
    }

    public void display() {
       System.out.println("Customer #" + idNumber + " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
