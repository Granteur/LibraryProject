public class periodical{
    private int issueNumber;
    private String releaseSchedule; //weekly, monthly, quarterly, annually - possibly ENUM?
    private String type; //magazine, newspaper etc - possibly ENUM?

    public int getIssueNumber(){
        return this.issueNumber;
    }

    public String getReleaseSchedule(){
        return this.releaseSchedule;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }

    public void setReleaseSchedule(String releaseSchedule){
        this.releaseSchedule = releaseSchedule;
    }


}