package com.karthikprojects;


import com.karthikprojects.RESTModels.PhotoResponse;
import retrofit2.Call;
import retrofit2.http.GET;


import java.util.List;
/*Interface used for API call . This will actually Create List of photoResponse when getPhotos() called */

public interface JSONResponseAPI {
    @GET("/photos")
    Call<List<PhotoResponse>> getPhotos();
}
