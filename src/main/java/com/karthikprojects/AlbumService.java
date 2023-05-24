package com.karthikprojects;

import com.karthikprojects.Exceptions.KeyNotFoundException;
import com.karthikprojects.RESTModels.PhotoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*Album Service  is used to
1. Create Album
2. Add Specific Photos Based on Album ID
3. Throws NumberFormatException and KeyNotFoundException(Custom Exception)*/

public class AlbumService {
    private HashMap<Integer, List<PhotoResponse>> Album = new HashMap<>();

    public void insertPhotos2Album(List<PhotoResponse> pr){
        HashMap<Integer, List<PhotoResponse>> album = this.getAlbum();
        for (PhotoResponse photo:pr) {
            if(!album.containsKey(photo.getAlbumId())){
                album.put(photo.getAlbumId(),new ArrayList<PhotoResponse>());
            }
            album.get(photo.getAlbumId()).add(photo);
        }
    }

    public HashMap<Integer, List<PhotoResponse>> getAlbum() {
        return Album;
    }

    public void ShowPhotosbyID(String arg)  throws KeyNotFoundException,NumberFormatException{
        try{

            int key = Integer.parseInt(arg);

            HashMap<Integer,List<PhotoResponse>> album=this.getAlbum();
            if (!album.containsKey(key)){
                throw new KeyNotFoundException("Album key not found");
            }
            List<PhotoResponse> PhotoListByKey=album.get(key);
            for(PhotoResponse photo:PhotoListByKey) {
                System.out.println(photo);
            }
        }catch(NumberFormatException e){

            throw new NumberFormatException("Argument cannot be converted to Integer");
        }
    }
}
