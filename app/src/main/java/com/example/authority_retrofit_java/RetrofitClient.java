package com.example.authority_retrofit_java;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*created by qendev
 * on 29th-05-2020(during Corona Pandemic) */

public class RetrofitClient {

    private static Retrofit retrofit;

//Define the base URL//

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

//Create the Retrofit instance//

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)

//Add the converter//

                    .addConverterFactory(GsonConverterFactory.create())

//Build the Retrofit instance//

                    .build();
        }
        return retrofit;
    }
}


//you can use multiple converters in a single Retrofit instance, for example:

//public static Retrofit getRetrofitInstance() {
//    if (retrofit == null) {
//        retrofit = new retrofit2.Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//
////Add Moshi’s converter factory//
//
//                .addConverterFactory(MoshiConverterFactory.create())
//                .build();
//    }
//    return retrofit;

//If you apply multiple converters, then your app will always use the first compatible converter that’s passed to Retrofit, which in the above example is Gson.
// Assuming that the above code retrieves data that can be processed by either Gson or Moshi, then it will always use the Gson converter.