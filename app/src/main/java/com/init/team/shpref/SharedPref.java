package com.init.team.shpref;

import android.app.Application;
import android.content.Context;

/**
 * Created by dev on 19.10.17.
 */

public class SharedPref extends Application {

    public static final String FILE_NAME = "Shared Pref Data";

    android.content.SharedPreferences sharedPreferences;
    android.content.SharedPreferences.Editor editor;

    String token;
    String email;
    String name;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getSharedPreferences( FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public void sharedPrefPutToken(){
        editor.putString("token from background" , token);
        editor.apply();
    }


    public void  sharedPrefPutName(){
        editor.putString("token from background" , name);
        editor.apply();
    }

    public void  sharedPrefPutEmail(){
        editor.putString("token from background" , email);
        editor.apply();
    }

    public void setToken(String token){
        this.token = token;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getToken(){
        return token;
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }



}
