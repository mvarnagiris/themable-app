package com.themableapp.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;

public class ThemeUtils {
    public static int getColor(@NonNull Context context, @AttrRes int resId) {
        final TypedArray a = context.getTheme().obtainStyledAttributes(new int[]{resId});
        final int color = a.getColor(0, 0);
        a.recycle();
        return color;
    }
}
