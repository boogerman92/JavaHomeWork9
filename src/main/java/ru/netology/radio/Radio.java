package ru.netology.radio;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int minVolume = 0;
    private int maxVolume =100;
    private int currentRadioStation;
    private int currentVolume;

    public Radio(int size){
        maxRadioStation = size - 1;
    }

    public Radio(){
        minRadioStation = 0;
        maxRadioStation = 9;
    }


    public int getCurrentRadioStation(){

        return currentRadioStation;
    }

    public int getMinRadioStation(){
        return minRadioStation;
    }

    public int getMaxRadioStation(){
        return maxRadioStation;
    }

    public int getCurrentVolume(){

        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation){
        if (newCurrentRadioStation < minRadioStation){
            return;
        }
        if (newCurrentRadioStation > maxRadioStation){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void NextRadioStation(){

        if (currentRadioStation < maxRadioStation){
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= maxRadioStation){
            currentRadioStation = minRadioStation;
        }
    }

    public int PrevRadioStation(){
        if (currentRadioStation <= minRadioStation){
            currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation = currentRadioStation -1;
        }
        return currentRadioStation;
    }



    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume < minVolume){
            return;
        }
        if (newCurrentVolume > maxVolume){
            return;
        }

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(){
        if (currentVolume < maxVolume){
            currentVolume = currentVolume + 1;
        }

    }

    public int reductionVolume(){
        if (currentVolume <= minVolume){
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

}