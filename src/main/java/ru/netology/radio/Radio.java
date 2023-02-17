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

    public void prevRadioStation(){
        if (currentRadioStation < 10){
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0){
            currentRadioStation = 9;
        }
    }

    public int currentVolume;

    public int getCurrentVolume(){
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < 0){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(){
        if (currentVolume < 10){
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10){
            currentVolume = 10;
        }
    }

    public void reductionVolume(){
        if (currentVolume <= 10){
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0){
            currentVolume = 0;
        }
    }

}
