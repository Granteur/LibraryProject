public class movie extends libraryitem{
    private String studio, format, length, director, actor;
    //format possibly an ENUM- 4K, Blu-Ray, DVD, VHS

    public String getStudio(){
        return this.studio;
    }
    public String getFormat(){
        return this.format;
    }
    public String getLength(){
        return this.length;
    }
    public String getDirector(){
        return this.director;
    }
    public String getActor(){
        return this.actor;
    }
    
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }

}