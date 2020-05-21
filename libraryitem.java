public class libraryitem{
    private String title;
    private int itemNumber;
    private int quantity;
    private String location;
    private boolean instockStatus;
    private String genre;
    private int releaseDate;


    //getters
    public String getTitle(){
        return title;
    }
    public int getItemNumber(){
        return itemNumber;
    }
    public int getQuantity(){
        return quantity; //how many copies of the items are in system
    }
    public String getLocation(){
        return location;
    } 
    public boolean getInstockStatus(){ //possible enum? 
        return instockStatus;
    }
    public String getGenre(){
        return genre;
    }
    public int getReleaseDate() {
        return releaseDate;
    }


    //setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setItemNumber(int itemNumber){
        this.itemNumber = itemNumber;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setInstockStatus(boolean instockStatus){
        this.instockStatus = instockStatus;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }
}