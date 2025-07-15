package Ex_29_Enum;

public enum Locators {
    page_input_email("username"),
    page_input_pass("password"),
    page_button("btn");

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }
}
