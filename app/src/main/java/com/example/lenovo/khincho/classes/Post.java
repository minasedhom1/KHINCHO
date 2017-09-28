package com.example.lenovo.khincho.classes;

import java.util.ArrayList;

/**
 * Created by lenovo on 27/09/2017.
 */

public class Post {

    int user_id,post_id;
    String photo_url,video_url;
    ArrayList<User>likes_user_list;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public ArrayList<User> getLikes_user_list() {
        return likes_user_list;
    }

    public void setLikes_user_list(ArrayList<User> likes_user_list) {
        this.likes_user_list = likes_user_list;
    }
}
