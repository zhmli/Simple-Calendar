package com.simplemobiletools.calendar;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Locale;

public class Config {
    private SharedPreferences mPrefs;

    public static Config newInstance(Context context) {
        return new Config(context);
    }

    public Config(Context context) {
        mPrefs = context.getSharedPreferences(Constants.PREFS_KEY, Context.MODE_PRIVATE);
    }

    public boolean getIsFirstRun() {
        return mPrefs.getBoolean(Constants.IS_FIRST_RUN, true);
    }

    public void setIsFirstRun(boolean firstRun) {
        mPrefs.edit().putBoolean(Constants.IS_FIRST_RUN, firstRun).apply();
    }

    public boolean getIsDarkTheme() {
        return mPrefs.getBoolean(Constants.IS_DARK_THEME, false);
    }

    public void setIsDarkTheme(boolean isDarkTheme) {
        mPrefs.edit().putBoolean(Constants.IS_DARK_THEME, isDarkTheme).apply();
    }

    public boolean getIsSundayFirst() {
        boolean isSundayFirst = java.util.Calendar.getInstance(Locale.getDefault()).getFirstDayOfWeek() == java.util.Calendar.SUNDAY;
        return mPrefs.getBoolean(Constants.SUNDAY_FIRST, isSundayFirst);
    }

    public void setIsSundayFirst(boolean sundayFirst) {
        mPrefs.edit().putBoolean(Constants.SUNDAY_FIRST, sundayFirst).apply();
    }

    public boolean getDisplayWeekNumbers() {
        return mPrefs.getBoolean(Constants.WEEK_NUMBERS, false);
    }

    public void setDisplayWeekNumbers(boolean displayWeekNumbers) {
        mPrefs.edit().putBoolean(Constants.WEEK_NUMBERS, displayWeekNumbers).apply();
    }

    public int getLastOtherReminderMins() {
        return mPrefs.getInt(Constants.LAST_OTHER_REMINDER_MINS, 10);
    }

    public void setLastOtherReminderMins(int lastMins) {
        mPrefs.edit().putInt(Constants.LAST_OTHER_REMINDER_MINS, lastMins).apply();
    }

    public int getView() {
        return mPrefs.getInt(Constants.VIEW, Constants.MONTHLY_VIEW);
    }

    public void setView(int view) {
        mPrefs.edit().putInt(Constants.VIEW, view).apply();
    }
}
