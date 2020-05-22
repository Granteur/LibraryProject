public class book extends libraryitem{
    private int numberOfPages;

    public book(){}

    public book(String title, int itemNumber, int quantity, String location, boolean instockStatus, String genre, int releaseDate, int numberOfPages){
        Super(title, itemNumber, quantity, location, instockStatus, genre, releaseDate, numberOfPages);
    }
    
    

    

    private void Super(String title, int itemNumber, int quantity, String location, boolean instockStatus, String genre,
            int releaseDate, int numberOfPages2) {
    }

    // getters
    public int getNumberOfPages(){
        return numberOfPages;
    }

    //setters
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}