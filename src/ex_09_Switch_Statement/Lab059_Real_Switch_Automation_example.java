package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab059_Real_Switch_Automation_example {
    public static void main(String[] args) {

        // Web  Automation
        // I will ask the user to give me input from browser which he wants to use
        // So i will start the automation in that browser

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {

            case "chrome" :
                System.out.println("1. Navigate to the chrome browser");
                System.out.println("2. TC1 then TC2 will execute");
                break;

            case "Edge" :
                System.out.println("1. Navigate to the Edge browser");
                System.out.println("2. TC1 then TC2 will execute");
                break;

            case "Firefox" :
                System.out.println("1. Navigate to the Firefox browser");
                System.out.println("2. TC1 then TC2 will execute");
                break;

            case "Opera" :
                System.out.println("In Selenium 4, Opera is no more support for automation");
                break;
            default:
                System.out.println("User not gave the correct browser details for automation");
                break;

        }
    }
}
