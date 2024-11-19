package main;
import model.Song;
import model.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Song> songlist = new ArrayList<>();
        Song s1 = new Song("blue eyes", "3:20 min");
        Song s2 = new Song("char bottle", "5:20 min");
        Song s3 = new Song("i m a mf millionare ", "2:20 min");
        Song s4 = new Song("lungi dance", "3:00 min");

        songlist.add(s1);
        songlist.add(s2);
        songlist.add(s3);
        songlist.add(s4);

        Album album1 = new Album("v1", "honey paaji" ,songlist);
        System.out.println(album1);

        System.out.println("Find song from album");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        if(album1.findSongs(title)){
            System.out.println("Song "+title+" playing");
        }
        else{
            System.out.println("not Present");
        }

        //select prev or next
        System.out.print("play prev or next: ");
        int prevOrNext = sc.nextInt();

        if(prevOrNext == 1){
             album1.nextSong(title);
        }
        else if(prevOrNext == -1){
            album1.prevSong(title);
        }
        else{
            System.out.println("playing "+title+".........");
        }
    }
}