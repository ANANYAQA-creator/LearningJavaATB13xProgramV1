package ex_22_OOPs_Encapsulation;

public class Lab156_EcapDemo {
    public static void main(String[] args) {

        VWOlogin vwologin = new VWOlogin("abcc@cts.com","1234");
        System.out.println(vwologin.password);  // 1234

        GoodVWOlogin goodVWOlogin = new GoodVWOlogin("xyz@sds.com","4312");
       // System.out.println(goodVWOlogin.Password);
       // goodVWOlogin.setPassword("5678",true);
        String Password = goodVWOlogin.getPassword();
        System.out.println(Password);


    }
}

class VWOlogin {
    public String username;
    public String password;

    public VWOlogin(String username, String password) {

        this.username = username;
        this.password = password;
    }
}

class GoodVWOlogin {
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    // Above are private in nature in encapsulation

    private String Username;
    private String Password;

    // parameter Constructor

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin){
            this.Password = Password;
        }else {
            System.out.println("Can't change the Password !!");
        }
        Password = password;
    }

    public GoodVWOlogin (String Username, String Password){

        this.Username= Username;
        this.Password= Password;
    }
}

