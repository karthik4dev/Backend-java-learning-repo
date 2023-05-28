package com.karthikprojects;

import com.karthikprojects.RESTModels.PhotoResponse;

import java.io.IOException;
import java.security.Key;
import java.util.*;
/*Main method is created here. Main method Arguments are used as Album Keys.
* API used are RetroFit and OKHTTP
* Number of Arguments can be given here but only processes arguments which can be converted to Integers .   */
public class Main {

    public static void main(String[] args) throws Exception {

        RESTClient restClient = new RESTClient();
        var apiResponse=  restClient.getRestClient().getPhotos().execute(); //Creates List of PhotoResponse Objects

        AlbumService As=new AlbumService();//Creates Album which uses Hashmap of Integer and List of PhotoResponse Object
        As.insertPhotos2Album(apiResponse.body());//Adding photos to segregate

        for (int i =0 ;i<args.length;i++) {
            As.ShowPhotosbyID(args[i]); //Shows Photos with Album Key given
        }

    }
}