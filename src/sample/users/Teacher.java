package sample.users;

import sample.courses.Course;
import sample.media.Video;

import java.util.ArrayList;

/**
 * Created by Rohan on 29-08-2017.
 */
public class Teacher extends User{
    private ArrayList<Course> courses;

    public boolean addVideo(Course c, Video v) {

    }

    public boolean addCourse(Course c) {

    }


    public boolean deleteVideo(Course c, Video v) {

    }

    public boolean deleteCourse(Course c) {

    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
