package ex_29_ENUM;

public enum Colors {

    // Color names with Hex Values

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String HEXcode;

    Colors(String HEXcode){
        this.HEXcode = HEXcode;
    }

    String getHEXcode() {
        return this.HEXcode;
    }
}
