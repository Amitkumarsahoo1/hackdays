package user_energy;
/**
 * Created  on 3/31/2016.
 */
public class BMRData {
    float height,bmr,weight;
    String age_group,gender;


    public BMRData(String age_group, float height, float weight, String gender, float bmr) {
        this.age_group = age_group;
        this.height = height;
        this.weight=weight;
        this.gender = gender;
        this.bmr = bmr;
    }


    public BMRData(float height, String age_group, String gender) {
        this.height = height;
        this.gender = gender;
        this.age_group = age_group;
    }


    public float getHeight() {

        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getAge_group() {
        return age_group;
    }

    public String getGender() {
        return gender;
    }

    public String toString(){
        return gender+"-"+age_group+"-"+height+"-"+bmr+"-"+weight;
    }

    public String bmr_by_user_details_key(){
        return gender+"-"+age_group+"-"+height;
    }


}
