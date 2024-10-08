package org.example.people;

import com.google.gson.annotations.SerializedName;

public class Owner {
    @SerializedName("Firstname")
    public String firstname;
    @SerializedName("Lastname")
    public String lastname;
    public String id;


    public Owner(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}