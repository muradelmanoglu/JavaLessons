package Main.L15;

import java.util.LinkedList;

public class MusicPlayer {
    public static void move(LinkedList<Song> list, String songTitle) {
        Song found = null;

        for (Song s : list) {
            if (s.title.equalsIgnoreCase(songTitle)) {
                found = s;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            list.addFirst(found);
            System.out.println(" " + songTitle + "' siyahının başına gətirildi.");
        } else {
            System.out.println("Xəta: '" + songTitle + "' adlı mahnı tapılmadı.");
        }
    }

    public static void printPlaylist(LinkedList<Song> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    static void main(String[] args) {
        LinkedList<Song> playlist = new LinkedList<>();

        playlist.add(new Song("November", "Isfar Sarabski", 6.42));
        playlist.add(new Song("Bohemian Rhapsody", "Queen", 6.00));
        playlist.add(new Song("Sarı Gəlin", "Alim Qasımov", 6.27));
        playlist.add(new Song("Lose Control", "Teddy Swims ", 3.29));

        System.out.println("--- İlkin Pleylist ---");
        printPlaylist(playlist);

        move(playlist, "Sarı Gəlin");

        System.out.println("--- Yenilənmiş Pleylist ---");
        printPlaylist(playlist);

        move(playlist, "Xatirədir");
    }
}
