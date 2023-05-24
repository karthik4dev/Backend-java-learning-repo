package com.karthikprojects.RESTModels;
/*Model used to handle Photo responded by Website , This is also called as POJO(Plain Old Java Object).It is actually created by ROBO POJO generator(plugin of IntelliJ IDE). To String is Overriden to return albumID,PhotoID and PhotoTitle seperated by Spaces */
public class PhotoResponse {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public int getAlbumId(){
        return albumId;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public String getThumbnailUrl(){
        return thumbnailUrl;
    }

    @Override
    public String toString() {
        String photoAttributes=this.albumId+" "+this.id+" "+this.title+"\n";
        return photoAttributes;
    }
}
