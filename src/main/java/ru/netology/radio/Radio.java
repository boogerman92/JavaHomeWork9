package ru.netology.radio;

public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation < 0){
            return;
        }
        if (newCurrentRadioStation > 9){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation(){

        if (currentRadioStation < 9){
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9){
            currentRadioStation = 0;
        }
    }

    public int prevRadioStation(){
        if (currentRadioStation <= 0){
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation -1;
        }
        return currentRadioStation;
    }

    public int currentVolume;

    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume <= 0){
            return;
        }
        if (newCurrentVolume > 10){
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(){
        if (currentVolume < 10){
            currentVolume = currentVolume + 1;
        }

    }

    public int reductionVolume(){
        if (currentVolume <= 0){
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

}