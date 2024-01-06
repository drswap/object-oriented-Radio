package ru.netology.object.oriented.Radio;

public class Radio {
    private int minStationNumber = 0; //минимальный номер станции
    private int numberStations = 10; //количество станций
    private int maxStationNumber = numberStations + minStationNumber - 1; //максимальный номер станции
    private int currentRadioStationNumber; //текущий номер радиостанции
    private int currentVolume; //текущий уровень громкости звука

    public Radio(int numberOfStations) {
       this.numberStations = numberOfStations;
       this.maxStationNumber = this.numberStations - 1;
    }
    
    public Radio() {

    }


    public int getCurrentRadioStationNumber() { //отдать текущий номер радиостанции
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() { //отдать текущий уровень громкости звука
        return currentVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) { //установить новый текущий номер радиостанции
        if (newCurrentRadioStationNumber < minStationNumber) {
            newCurrentRadioStationNumber = maxStationNumber;
        }
        if (newCurrentRadioStationNumber > maxStationNumber) {
            newCurrentRadioStationNumber = minStationNumber;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
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
        int next = getCurrentRadioStationNumber() + 1;
        setCurrentRadioStationNumber(next);
    }

    public void prev1ChannelNumber() {
        int prev = getCurrentRadioStationNumber() - 1;
        setCurrentRadioStationNumber(prev);
    }

    public void setTheRadioStationNumber(int newCurrentRadioStationNumber) {//установить номер станции в диапазоне от 0 до 9
        if (newCurrentRadioStationNumber < minStationNumber) {
            return;
        }
        if (newCurrentRadioStationNumber > maxStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
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
