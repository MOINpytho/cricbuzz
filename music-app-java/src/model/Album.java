package model;
import java.util.*;
public class Album {
    private String albumName;
    private String artistName;
    private List<Song> songList;

    public Album(String albumName, String artistName, List<Song> songList) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.songList = songList;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }

    public boolean findSongs(String title){
        //traverse the list and find the song
        for(Song s1: songList){
            if(s1.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }
    public String addSongsInAlbum(Song s1){
        //check if song is present in songlist
        //if yes then don't add else add it
        if(!findSongs(s1.getTitle())){
           songList.add(s1);
           return  "song added to the album";
        }
        else return "song already present";
    }

    public void prevSong(String title){
        for(int i=0;i<=songList.size();i++){
            if(songList.get(i).getTitle().equals(title)){
                System.out.print("now playing "+ songList.get(i-1).getTitle()+"..........");
                break;
            }
        }
    }
    public void nextSong(String title){
        for(int i=0;i<=songList.size();i++){
            if(songList.get(i).getTitle().equals(title)){
                System.out.print("now playing "+ songList.get(i+1).getTitle()+"..........");
                break;
            }
        }
    }
}
