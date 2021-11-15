package com.fahmiamaru.fragmentrecyclev2;

public class hero {
    String title1;
    int photo1;

    public hero(){
    }
    public hero(String judul1, int img1){
        title1 = judul1;
        photo1= img1;
    }

    public String getTitle1() {
        return title1;
    }

    public int getPhoto1() {
        return photo1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public void setPhoto1(int photo1) {
        this.photo1 = photo1;
    }
}
