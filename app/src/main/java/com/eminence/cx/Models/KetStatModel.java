package com.eminence.cx.Models;

public class KetStatModel {
    String id, ketName, keyState, keyScore;
    int keyImg;

    public KetStatModel(String id, String ketName, String keyState, String keyScore, int keyImg) {
        this.id = id;
        this.ketName = ketName;
        this.keyState = keyState;
        this.keyScore = keyScore;
        this.keyImg = keyImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKetName() {
        return ketName;
    }

    public void setKetName(String ketName) {
        this.ketName = ketName;
    }

    public String getKeyState() {
        return keyState;
    }

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    public String getKeyScore() {
        return keyScore;
    }

    public void setKeyScore(String keyScore) {
        this.keyScore = keyScore;
    }

    public int getKeyImg() {
        return keyImg;
    }

    public void setKeyImg(int keyImg) {
        this.keyImg = keyImg;
    }
}
