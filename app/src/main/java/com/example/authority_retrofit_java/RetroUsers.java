package com.example.authority_retrofit_java;

import com.google.gson.annotations.SerializedName;

/*created by qendev
 * on 29th-05-2020(during Corona Pandemic) */

public class RetroUsers {

//Give the field a custom name//

    @SerializedName("name")
    private String name;

    public RetroUsers(String name) {
        this.name = name;

    }

//Retrieve the data using setter/getter methods//

    public String getUser() {
        return name;
    }

    public void setUser(String name) {
        this.name = name;
    }

}