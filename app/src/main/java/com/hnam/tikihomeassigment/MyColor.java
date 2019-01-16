package com.hnam.tikihomeassigment;

/**
 * Created by nampham on 1/16/19.
 */
public enum MyColor {
    RED("#e57373"),
    PINK("#F06292"),
    PURPLE("#BA68C8"),
    BLUE("#64B5F6"),
    TEAL("#4DB6AC"),
    LIGHT_GREEN("#AED581"),
    ORANGE("#FFB74D"),
    GREY("#90A4AE");

    private final String value;

    MyColor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
