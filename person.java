public class person{
    //private properties
    private String firstName, lastName, emailAddress, mailingAddress, classification;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getMailingAddress(){
        return this.mailingAddress;
    }
    public String getClassification(){
        return this.classification;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
      public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setMailingAddress(String mailingAddress){
        this.mailingAddress = mailingAddress;
    }
    public void setClassification(String classification){
        this.classification = classification;
    }

}