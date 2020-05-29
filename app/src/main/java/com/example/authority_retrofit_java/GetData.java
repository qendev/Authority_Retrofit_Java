package com.example.authority_retrofit_java;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/*created by qendev
 * on 29th-05-2020(during Corona Pandemic) */

//you can include multiple endpoints in a single interface.

public interface GetData {
    //Specify the request type and pass the relative URL//

    @GET("/users")

//Wrap the response in a Call object with the type of the expected result//

    Call<List<RetroUsers>> getAllUsers();
}
