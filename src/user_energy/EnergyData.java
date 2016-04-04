package user_energy;

import java.util.ArrayList;

/**
 * Created on 4/1/2016.
 */
public class EnergyData {
    BMRData bmr;
    ArrayList<PALdata> energy_needs_as_per_bmr = new ArrayList<PALdata>();

    public EnergyData() {
        System.out.println("Basic Constructor - Energy Data class");
    }

    public EnergyData(BMRData bmr, ArrayList<PALdata> energy_needs_as_per_bmr) {
        this.bmr = bmr;
        this.energy_needs_as_per_bmr = energy_needs_as_per_bmr;
    }

    public BMRData getBmr() {
        return bmr;
    }

    public ArrayList<PALdata> getEnergy_needs_as_per_bmr() {
        return energy_needs_as_per_bmr;
    }

    public String toString(){
        return bmr.getGender()+"-"+bmr.getAge_group()+"-"+bmr.getHeight()+"-"+bmr.getWeight()+"-"+bmr.getHeight();
        //Unique Key for Hash Map
    }
}
