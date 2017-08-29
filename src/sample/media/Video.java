package sample.media;

import sample.status.VideoStatus;
import sample.users.User;

import java.sql.Time;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by Rohan on 29-08-2017.
 */
public class Video {
    private int NO_OF_LIKES;
    private TreeSet<User> likers;
    private int NO_OF_VIEWS;
    private HashMap<User,String>comments;
    private VideoStatus videoStatus;
    private Time currentTime;
    private Time duration;
    private String extension;
    private String name;

    public int getNO_OF_LIKES() {
        return NO_OF_LIKES;
    }

    public TreeSet<User> getLikers() {
        return likers;
    }

    public int getNO_OF_VIEWS() {
        return NO_OF_VIEWS;
    }

    public HashMap<User, String> getComments() {
        return comments;
    }

    public void incrementLikes(User user) {
        likers.add(user);
        NO_OF_LIKES++;
    }

    public void decrementLikes(User user){
        if(!likers.isEmpty()) {
            likers.remove(user);
            NO_OF_LIKES--;
        }
    }
}
