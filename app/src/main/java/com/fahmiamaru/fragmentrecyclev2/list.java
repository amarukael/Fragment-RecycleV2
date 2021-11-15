package com.fahmiamaru.fragmentrecyclev2;

public class list {
    private String title;
    private String des;
    private int photo;

    public list(){
    }
    public list(String judul, String ket, int img){
        title = judul;
        des = ket;
        photo = img;
    }

    public String getTitle(){
        return title;
    }

    public String getDes(){
        return  des;
    }

    public int getPhoto(){
        return photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
