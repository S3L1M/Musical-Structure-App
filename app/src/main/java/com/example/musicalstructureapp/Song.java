package com.example.musicalstructureapp;

public class Song {
    private String mTitle;
    private String mUploader;

    public Song(String title, String uploader) {
        mTitle = title;
        mUploader = uploader;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUploader() {
        return mUploader;
    }

}
