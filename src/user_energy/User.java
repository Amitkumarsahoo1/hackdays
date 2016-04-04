package user_energy;

import user_energy.*;
/**
 * Created by prateek.mishra on 4/1/2016.
 */
public abstract class User {
    String name;
    String gender;

    String age_group;
    float height;

    public User() {
    }

    public User(String name, String gender, String age_group, float height) {
        this.name = name;
        this.gender = gender;
        this.age_group = age_group;
        this.height = height;
    }

    public String getName() {
        return name;
    }


    public String getAge_group() {
        return age_group;
    }

    public String getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

}
