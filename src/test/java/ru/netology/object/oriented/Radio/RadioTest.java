package ru.netology.object.oriented.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void channelNumber() {               //установить текущий номер радиостанции
        Radio station = new Radio();        //новый объект Radio
        station.setCurrentStationNumber(5);//допустимые номера радиостанций от 0 до 9

        int expected = 5;//ожидаемый номер радиостанции
        int actual = station.getCurrentStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void channelNumberLowerBound() {               //установить текущий номер радиостанции нижняя граница
        Radio station = new Radio();              //новый объект Radio
        station.setTheStationNumber(0);  //допустимые номера радиостанций от 0 до 9

        int expected = 0;                       //ожидаемый номер радиостанции
        int actual = station.getCurrentStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void channelNumberUpperBound() {               //установить текущий номер радиостанции верхняя граница
        Radio station = new Radio();              //новый объект Radio
        station.setTheStationNumber(9);  //допустимые номера радиостанций от 0 до 9

        int expected = 9;                       //ожидаемый номер радиостанции
        int actual = station.getCurrentStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {//установить текущий номер радиостанции выше максимального
        Radio station = new Radio();
        station.setTheStationNumber(10);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = station.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMin() {//установить текущий номер радиостанции ниже минимального
        Radio station = new Radio();
        station.setTheStationNumber(-1);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = station.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {                      //установить текущий номер на следующий номер
        Radio station = new Radio();
        station.setCurrentStationNumber(6);
        station.next1ChannelNumber();

        int expected = 7;
        int actual = station.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationCarousel() {                      //установить текущий номер на следующий номер по карусели
        Radio station = new Radio();
        station.setCurrentStationNumber(9);              //установить текущий номер 9
        station.next1ChannelNumber();

        int expected = 0;
        int actual = station.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {                      //установить текущий номер на предыдущий номер
        Radio channel = new Radio();
        channel.setCurrentStationNumber(7);
        channel.prev1ChannelNumber();

        int expected = 6;
        int actual = channel.getCurrentStationNumber();
        Assertions.assertEquals(6, channel.getCurrentStationNumber());
    }

    @Test
    public void prevStationCarousel() {                      //установить текущий номер на предыдущий номер по карусели
        Radio channel = new Radio();
        channel.setCurrentStationNumber(0);      //установить текущий номер 0
        channel.prev1ChannelNumber();

        Assertions.assertEquals(9, channel.getCurrentStationNumber());
    }

    @Test
    public void setTheVolume() {                        //установить громкость
        Radio volume = new Radio();   //новый объект уровень громкости звука
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);                   //текущая громкость звука (допустимые значения от 0 до 100)
        volume.increaseVolume();                        //громкость звука увеличить на 1

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);                   //текущая громкость звука (допустимые значения от 0 до 100)
        volume.increaseVolume();                        //громкость звука увеличить на 1

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerTheVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);                     //текущая громкость звука (допустимые значения от 0 до 100)
        volume.lowerVolume();                           //громкость звука уменьшить на 1

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerTheVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);                     //текущая громкость звука (допустимые значения от 0 до 100)
        volume.lowerVolume();                           //громкость звука уменьшить на 1

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
