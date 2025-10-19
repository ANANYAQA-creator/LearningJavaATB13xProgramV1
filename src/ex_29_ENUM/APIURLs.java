package ex_29_ENUM;

public enum APIURLs {

    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    public String getUrl() {
        return this.url;
    }

    APIURLs(String url){
        this.url = url;
    }

}
