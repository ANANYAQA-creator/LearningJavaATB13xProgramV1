package ex_21_OOPs_Polymorphism.MethodOverLoading;

public class WebAutomation_Browser {
    public static void main(String[] args) {


        Browser b1 = new Browser();
        b1.startBrowser(); // Starting a default Browser
        b1.startBrowser("Chrome");  // Starting a browserChrome
    }
}
    class Browser {
        void startBrowser (){
            System.out.println("Starting a default Browser");
        }

        String startBrowser (String browser){
            System.out.println("Starting a browser " + browser);
            return browser;
        }
}
