package user_energy;

import java.util.Arrays;

/**
 * Created  on 3/31/2016.
 */
public class LoginDetails {
    String username;
    char [] password;
    char[] correctPass = new char[] {'i', 'n', 'f', 'o', '@', '1','2','3'};


    LoginDetails(String username, char[] password){
        this.username=username;
        this.password=password;
    }

    protected boolean verifyLoginDetails(){
        System.out.print(username+"-"+password);

        if (username.equalsIgnoreCase("shyamal") && Arrays.equals(password, correctPass))
            return true;

     return false;
    }
}
