package contacts;
import java.util.regex.Pattern;
public class User{
    private String fullName;
    private String phoneNumber;
    private String gmail;
    private String address;
    private String messege;
    private boolean f;
    {
        messege = "";
        fullName = "";
        gmail = "";
        phoneNumber = "";
        address = "";
        f = true;
    }
    public String getMessege() {
        return messege;
    }
    public User(String fullName, String phoneNumber, String gmail, String address) {
        this(fullName , phoneNumber , gmail);
        setAddress(address);
    }
    public User(String fullName, String phoneNumber, String gmail) {
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setGmail(gmail);
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        if (fullName.trim().length() >= 10) {
            this.fullName = fullName.trim();
        } else {
            messege += "Full name is invalid\n";
            f = false;
        } 
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", phoneNumber.trim())) { //Egyption number only by regex
            this.phoneNumber = phoneNumber.trim();            
        } else {
            messege += "Phone number is invalid\n";
            f = false;
        }
    }
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        if (Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,6}\\.[a-z]{3,6}$", gmail.trim().toLowerCase())) { 
            this.gmail = gmail.trim().toLowerCase();        
        } else {
            messege += "Gmail is invalid\n";
            f = false;
        } 
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if (!(address.trim().length() > 20 || address.trim().length() < 3 )) {
            this.address = address.trim();
        } else {
            messege += "address is invalid";
            f = false;
        }
    }
    public boolean flag(){
        return f;
    } 

   
}
