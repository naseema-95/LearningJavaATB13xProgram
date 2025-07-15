package Ex_29_Enum;

public enum RestAPI {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String apiurls;

    RestAPI(String apiurls){
        this.apiurls = apiurls;
    }

    String getApiurls(){
        return this.apiurls;
    }
}
