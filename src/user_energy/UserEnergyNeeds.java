package user_energy;

import user_energy.*;
/**
 * Created  on 4/1/2016.
 */
public class UserEnergyNeeds extends User {
    float expected_average_weight;

    public UserEnergyNeeds() {
    }

    public UserEnergyNeeds(String name, String gender, String age_group, float height) {
        super(name, gender, age_group, height);
    }


    public void setExpected_average_weight(float expected_average_weight) {
        this.expected_average_weight = expected_average_weight;
    }

    public boolean verifyHeightValue(float height){
        if((height == 1.5f) || (height == 1.6f) || (height == 1.7f) || (height == 1.8f) || (height == 1.9f) || (height == 2.0f) )
            return true;

        return false;
    }
    public boolean verifyAgeGroup(int index){
        if(index >=0) // if something is selected , index will be zero or more than zero. If not selected, index will be -1
            return true;
        return false;
    }
    public boolean verifyGenderSelected(String gender){
        if( !gender.trim().equalsIgnoreCase("not_selected"))
            return true;
        return false;
    }

    public String getUserEnergyForDisplay(String user_name,String age_group,String PAL_description,String PAL_level,float height,float energy,String eaw){
        return "Hello "+user_name+"\n for your age group of "+age_group+", with PAL level "+PAL_description+" ,"+PAL_level+" and height of "+height+" m,you require "+energy+" Mega Joules energy per day.\n The Expected average weight for your height is "+eaw+" kg.";
    }
}
