package ex_29_ENUM;

public enum Locators {

    page_inputemails("#login-username"),
    page_inputpassword("#login-password"),
    page_button("#btn");

    private String locators;
    Locators(String locators){
        this.locators = locators;
    }

    public String getLocators() {
        return locators;
    }
}
