package ru.netology.object.oriented.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void channelNumber() {               //установить текущий номер радиостанции
        Radio channel = new Radio();              //новый объект Radio
        channel.setTheRadioStationNumber(5);  //допустимые номера радиостанций от 0 до 9

        int expected = 5;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }
    @Test
    public void channeOflNumber() {               //установить текущий номер радиостанции
        Radio channel = new Radio(6);              //новый объект Radio
        channel.setTheRadioStationNumber(5);  //допустимые номера радиостанций от 0 до 9

        int expected = 5;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void channelNumberLowerBound() {               //установить текущий номер радиостанции нижняя граница
        Radio channel = new Radio();              //новый объект Radio
        channel.setTheRadioStationNumber(0);  //допустимые номера радиостанций от 0 до 9

        int expected = 0;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }
    @Test
    public void channelOfNumberLowerBound() {               //установить текущий номер радиостанции нижняя граница
        Radio channel = new Radio(1);              //новый объект Radio
        channel.setTheRadioStationNumber(0);  //допустимые номера радиостанций от 0 до 9

        int expected = 0;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void channelNumberUpperBound() {               //установить текущий номер радиостанции верхняя граница
        Radio channel = new Radio();              //новый объект Radio
        channel.setTheRadioStationNumber(9);  //допустимые номера радиостанций от 0 до 9

        int expected = 9;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }
    @Test
    public void channelOfNumberUpperBound() {               //установить текущий номер радиостанции верхняя граница
        Radio channel = new Radio(56);              //новый объект Radio
        channel.setTheRadioStationNumber(55);  //допустимые номера радиостанций от 0 до 9

        int expected = 55;                       //ожидаемый номер радиостанции
        int actual = channel.getCurrentRadioStationNumber();//фактический номер радиостанции

        Assertions.assertEquals(expected, actual);//сравнение ОР и ФР
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {//установить текущий номер радиостанции выше максимального
        Radio channel = new Radio();
        channel.setTheRadioStationNumber(10);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotOfSetStationNumberAboveMax() {//установить текущий номер радиостанции выше максимального
        Radio channel = new Radio(15);
        channel.setTheRadioStationNumber(15);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMin() {//установить текущий номер радиостанции ниже минимального
        Radio channel = new Radio();
        channel.setTheRadioStationNumber(-1);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotOfSetStationNumberAboveMin() {//установить текущий номер радиостанции ниже минимального
        Radio channel = new Radio(-4);
        channel.setTheRadioStationNumber(-1);         //недопустимые номера: кроме от 0 до 9

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannel() {                      //установить текущий номер на следующий номер
        Radio channel = new Radio();
        channel.setCurrentRadioStationNumber(6);
        channel.next1ChannelNumber();

        int expected = 7;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextOfChannel() {                      //установить текущий номер на следующий номер
        Radio channel = new Radio(100);
        channel.setCurrentRadioStationNumber(88);
        channel.next1ChannelNumber();

        int expected = 89;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextChannelCarousel() {                      //установить текущий номер на следующий номер по карусели
        Radio channel = new Radio();
        channel.setCurrentRadioStationNumber(9);              //установить текущий номер 9
        channel.next1ChannelNumber();

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextOfChannelCarousel() {                      //установить текущий номер на следующий номер по карусели
        Radio channel = new Radio(50);
        channel.setCurrentRadioStationNumber(49);              //установить текущий номер 9
        channel.next1ChannelNumber();

        int expected = 0;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevChannel() {                      //установить текущий номер на предыдущий номер
        Radio channel = new Radio();
        channel.setCurrentRadioStationNumber(7);
        channel.prev1ChannelNumber();

        int expected = 6;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, channel.getCurrentRadioStationNumber());
    }
    @Test
    public void prevOfChannel() {                      //установить текущий номер на предыдущий номер
        Radio channel = new Radio(90);
        channel.setCurrentRadioStationNumber(70);
        channel.prev1ChannelNumber();

        int expected = 69;
        int actual = channel.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, channel.getCurrentRadioStationNumber());
    }

    @Test
    public void prevChannelCarousel() {                      //установить текущий номер на предыдущий номер по карусели
        Radio channel = new Radio();
        channel.setCurrentRadioStationNumber(0);      //установить текущий номер 0
        channel.prev1ChannelNumber();

        Assertions.assertEquals(9, channel.getCurrentRadioStationNumber());
    }
    @Test
    public void prevOfChannelCarousel() {                      //установить текущий номер на предыдущий номер по карусели
        Radio channel = new Radio(12);
        channel.setCurrentRadioStationNumber(0);      //установить текущий номер 0
        channel.prev1ChannelNumber();

        Assertions.assertEquals(11, channel.getCurrentRadioStationNumber());
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


        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(100, actual);
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
