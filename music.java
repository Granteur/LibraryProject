public class music extends libraryitem{
    private String artist;
    private int trackNumber;
    private String recordLabel;

    public String getArtist() {
        return this.artist;
    }
    
    public int getTrackNumber() {
        return this.trackNumber;
    }

    public String getRecordLabel() {
        return this.recordLabel;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }
}