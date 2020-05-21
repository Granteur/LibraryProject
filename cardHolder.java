public class cardHolder extends person{
    private double balance; //if cardholder has a balance/late fees, it shows here
    private String dateJoined; //the date they signed up for the card
    private int age; //cardholder's age- may come into play for adult or restricted content
    private int itemsOut; //number of items out a borrower has at a time, max of 99

    //getters
    public double getBalace(){
        return balance;
    }
    public String dateJoined(){
        return dateJoined;
    }
    public int getAge(){
        return age;
    }
    public int getItemsOut(){
        return itemsOut;
    }

    //setters
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setDateJoined(String dateJoined){
        this.dateJoined = dateJoined;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setItemsOut(int itemsOut){
        this.itemsOut = itemsOut;
    }
}
