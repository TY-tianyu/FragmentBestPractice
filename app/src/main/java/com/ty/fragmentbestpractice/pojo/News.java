package com.ty.fragmentbestpractice.pojo;

/**
 * Created by Tony on 2015/5/28.
 */
public class News {

    private String title;

    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
