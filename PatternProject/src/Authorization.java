
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Authorization implements Strategy_Pattern  {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private String Name;
    private boolean signedIn;
    static {
        DATA_BASE.put("qwerty1234", "alijan@2003.kz");
        DATA_BASE.put("wasd5678", "thomas@1985.uk");
    }



    @Override
    public void authorization() {
     try {
         while (!signedIn){
             System.out.print("Enter the user's email: ");
             email = READER.readLine();
             System.out.print("Enter the password: ");
             password = READER.readLine();
             if (verify()) {
                 System.out.println("Data verification has been successful.");
             } else {
                 System.out.println("Wrong email or password!");
             }
         }
     }catch (IOException ex){
         ex.printStackTrace();
     }
    }
    private boolean verify(){
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }
    @Override
    public boolean reg(String reg_name){
        if(signedIn){
            System.out.println("Hello " + reg_name);
            return true;
        }else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }


}
