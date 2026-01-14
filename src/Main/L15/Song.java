package Main.L15;

public class Song {
        String title;
        String artist;
        double duration;

        public Song(String title, String artist, double duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return artist + " - " + title + " (" + duration + " dəq)";
        }
}

