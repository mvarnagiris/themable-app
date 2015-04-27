package com.themableapp.utils;

public class UserPrefs extends PrefsObject {
    public static final String KEY = "user_prefs";

    private boolean isDarkTheme = false;

    public boolean isDarkTheme() {
        return isDarkTheme;
    }

    public void setIsDarkTheme(boolean isDarkTheme) {
        this.isDarkTheme = isDarkTheme;
    }
}
