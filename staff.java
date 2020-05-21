public class staff extends person{
    private String title, accessLevel;
    private int badgeNumber;

    public String getTitle() {
        return this.title;
    }
    public String getAccessLevel() {
        return this.accessLevel;
    }
    public int getBadgeNumber() {
        return this.badgeNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
}