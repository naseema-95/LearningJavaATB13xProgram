package Ex_29_Enum;

public enum Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String colors;

    Colors(String colors){
        this.colors = colors;
    }

    String getColors(){
        return this.colors;
    }
}
