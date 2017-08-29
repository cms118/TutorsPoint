package sample.users;

import sample.media.Video;

import java.util.TreeSet;

/**
 * Created by Rohan on 29-08-2017.
 */
public class User {
    protected String username;

    public boolean getLikeButtonStatus(Video video){
        TreeSet<User> likers = video.getLikers();
        if(likers.contains(this)){
            return true;
        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected String password;

}
