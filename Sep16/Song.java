package Sep16;

public class Song {
    private String title;
    private String artist;
    private int durationSeconds;

    public Song() {
        title = "Unknown";
        artist = "Unknown";
        durationSeconds = 0;
    }

    public Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

    // setters and getters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDurationSeconds() {
        return this.durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public double getDurationMinutes() {
        double durationMinutes = durationSeconds / 60.0;
        return durationMinutes;
    }

    public String getArtistInitial() {
        return artist.substring(0,1);
    }

    public int getTitleLength() {
        return title.length();
    }

    public String getLabel() {
        String label = title + " - " + artist;
        return label;
    }

    public String toString() {
        String output = " \"" + title + "\" by " + artist 
        + " (" + durationSeconds + "s)";
        return output;
    }

    public boolean equals(Song other) {
        if (this.title.equals(other.title) && this.artist.equals(other.artist)) {
            return true;
        } else {
            return false;
        }
    }
}
