package ex_21_OOPs_Polymorphism.MethodOverRiding;

public class WebAutomation_MethodOverriding {
    public static void main(String[] args) {

        // If needed to call Chrome Browser
        // ChromeBrowser cb = new ChromeBrowser();
        // cb.OpenBrowser();

        // If needed to call an Firefox browser
        // Firefox fx = new Firefox();
        // fx.OpenBrowser();

        // DYNAMIC DISPATCH

        CommontoAll c1 = new ChromeBrowser();
        c1.OpenBrowser();
    }
}

class CommontoAll {
    void OpenBrowser(){
        System.out.println("Starting an IE Browser");
    }
}

class ChromeBrowser extends CommontoAll{

    @Override
    void OpenBrowser(){
        System.out.println("Starting an Chrome Browser");
    }
}

class Firefox extends CommontoAll{
    void OpenBrowser(){
        System.out.println("Starting an Firefox Browser");
    }
}