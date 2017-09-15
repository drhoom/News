package com.example.android.news;


public class News {
    private String mTitle;
    private String mAuthor;
    private String mSection;
    private String mDatePublished;
    private String mUrl;


    public News(String title, String author, String section, String datePublished, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mDatePublished = datePublished;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getDatePublished() {
        return mDatePublished;
    }
}
