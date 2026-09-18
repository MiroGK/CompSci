package Sep16;

public class SongTester {
    public static void main(String[] args) {
        Song song1 = new Song("Blinding Lights", "The Weeknd", 180);
        double minutes = song1.getDurationMinutes();
        String initial = song1.getArtistInitial();
        int titleLen = song1.getTitleLength();
        System.out.println(song1.toString() 
        + " also, it is " + minutes + "mins long"); 

        Song original = new Song("Bring Me to Life", "Evanescence", 236);
        Song alias = original;
        alias.setArtist("Nelson Mandela"); 
        System.out.println(original.getArtist());

        Song a = new Song("Ain't It Fun", "Paramore", 296);
        Song b = new Song("Ain't It Fun", "Paramore", 296);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
