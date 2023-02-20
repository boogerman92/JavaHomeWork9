package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {

    @Test
    public void shouldSetNegativesRadioStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(11);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNineRadioStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(4);

        rad.NextRadioStation();

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNineRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.NextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(6);

        rad.PrevRadioStation();

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevZeroRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.PrevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevOneRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.PrevRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNineRadioStation(){
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.PrevRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(5);

        vol.increaseVolume();

        int expected = 6;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTenVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(10);

        vol.increaseVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNegativesVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(-1);

        vol.increaseVolume();

        int expected = 0;
        int actual = vol.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(5);

        vol.reductionVolume();

        int expected = 4;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReductionTenVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(10);

        vol.reductionVolume();

        int expected = 9;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReductionOverVolume(){
        Radio vol = new Radio();
        vol.setCurrentVolume(11);

        vol.reductionVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

}