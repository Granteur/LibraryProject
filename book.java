public class book extends libraryitem{
    private String author, publisher; 
    private int numberOfPages;

    //getters
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    //setters
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}