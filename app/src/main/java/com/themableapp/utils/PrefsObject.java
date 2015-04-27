package com.themableapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.Gson;

public abstract class PrefsObject {
    public static void put(@NonNull Context context, @NonNull String key, @Nullable Object value) {
        final SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        if (value != null) {
            editor.putString(key, new Gson().toJson(value)).apply();
        } else {
            editor.remove(key).apply();
        }
    }

    public static <T> T get(@NonNull Context context, @NonNull String key, @NonNull Class<T> cls) {
        final SharedPreferences preferences = getSharedPreferences(context);
        if (!preferences.contains(key)) {
            return null;
        }

        final String serialized = preferences.getString(key, null);
        if (serialized == null) {
            return null;
        }

        return new Gson().fromJson(serialized, cls);
    }

    private static SharedPreferences getSharedPreferences(@NonNull Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }
}
