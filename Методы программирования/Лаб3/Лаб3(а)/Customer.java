public class Customer implements Comparable<Customer>{
    private static int inc1 = 0;
    private static int inc2 = 0;
    int id;
    String firstName;
    String secondName;
    String middleName;
    String address;
    int numberOfCreditCard;
    String numberOfBankAccount;

    public Customer() {
        this.id = inc1++;
        this.firstName = "firstName";
        this.secondName = "secondName";
        this.middleName = "middleName";
        this.address = "address";
        this.numberOfCreditCard = inc2++;
        this.numberOfBankAccount = "numberOfBankAccount";
    }

    public Customer(int id, int numberOfCreditCard, String firstName, String secondName, String middleName,
                    String address, String numberOfBankAccount) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public Customer(Customer customer) {
        this.id = customer.id;
        this.firstName = customer.firstName;
        this.secondName = customer.secondName;
        this.middleName = customer.middleName;
        this.address = customer.address;
        this.numberOfCreditCard = customer.numberOfCreditCard;
        this.numberOfBankAccount = customer.numberOfBankAccount;
    }

    public static Customer[] createArray(int number){
        Customer[] customers = new Customer[number];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
        }
        String f1 = "A";
        String f2 = "A";
        String f3 = "A";
        char inc = 'a';
        for (Customer i : customers) {
            i.setFirstName(inc + "first");
            i.setMiddleName(inc + "middle");
            i.setSecondName(inc + "second");
            inc = 'a';
            inc += Math.random() * 26;
        }
        return customers;
    }

    @Override
    public int compareTo(Customer o) {
        return toString().compareTo(o.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public String getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public void setNumberOfBankAccount(String numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
 //               ", secondName='" + secondName + '\'' +
 //               ", middleName='" + middleName + '\'' +
 //               ", address='" + address + '\'' +
                ", numberOfCreditCard='" + numberOfCreditCard + '\'' +
 //               ", numberOfBankAccount='" + numberOfBankAccount + '\'' +
                '}';
    }
}
