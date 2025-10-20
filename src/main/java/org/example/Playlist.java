package org.example;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSongs(String song) {
        songs.add(song);
    }

    public void deleteSongs(String song) {
        songs.remove(song);
    }

    public void printSongs() {
        for (String song : this.songs) {
            System.out.println(song);
        }
    }
}

