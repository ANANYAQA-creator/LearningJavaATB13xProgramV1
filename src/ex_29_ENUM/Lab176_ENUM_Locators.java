package ex_29_ENUM;

public class Lab176_ENUM_Locators {
    public static void main(String[] args) {

        // Locators
        System.out.println(Locators.page_inputemails.getLocators());
        System.out.println(Locators.page_inputpassword.getLocators());
        System.out.println(Locators.page_button.getLocators());


        //Colors

        System.out.println(Colors.RED.getHEXcode());
        System.out.println(Colors.GREEN.getHEXcode());


        //APIURLs

        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
    }
}
