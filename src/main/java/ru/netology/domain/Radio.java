package ru.netology.domain;


public class Radio {
    private int quantityStation = 10;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > quantityStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setNextStation() {

        if (currentStation < quantityStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public int getNextStation() {
        return currentStation;
    }


    public void setPrevStation() {
        if (currentStation == 0) {
            currentStation = quantityStation - 1;
        }
        if (currentStation < quantityStation - 1) {
            currentStation = currentStation - 1;
        }
    }

    public int getPrevStation() {

        return currentStation;
    }


    public void setPlusVolume() {
        if (currentVolume == 0) {
            return;
        }

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }


    public int getPlusVolume() {

        return currentVolume;
    }

    public void setMinusVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }


    }

    public int getMinusVolume() {

        return currentVolume;
    }
}
