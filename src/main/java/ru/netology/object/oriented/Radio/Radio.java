package ru.netology.object.oriented.Radio;

public class Radio {
    private int currentStationNumber; //текущий номер радиостанции
    private int currentVolume;

    public int getCurrentStationNumber() { //отдать текущий номер радиостанции

        return currentStationNumber;
    }

    public int getCurrentVolume() { //отдать текущий уровень громкости звука

        return currentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) { //установить новый текущий номер радиостанции
        if (newCurrentStationNumber < 0) {
            newCurrentStationNumber = 9;
        }
        if (newCurrentStationNumber > 9) {
            newCurrentStationNumber = 0;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {//установить уровень громкости
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next1ChannelNumber() {
        int next = getCurrentStationNumber() + 1;
        setCurrentStationNumber(next);
    }

    public void prev1ChannelNumber() {
        int prev = getCurrentStationNumber() - 1;
        setCurrentStationNumber(prev);
    }

    public void setTheStationNumber(int newCurrentStationNumber) {//установить номер станции в диапазоне от 0 до 9
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
