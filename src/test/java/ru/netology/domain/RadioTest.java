package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void takesValuesAmountDefaultTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void takesValuesTest() {
        Radio radio = new Radio(12);

        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStationTest() {
        Radio radio = new Radio(18);

        Assertions.assertEquals(17, radio.getMaxStation());
    }

    @Test
    public void minStationDefaultTest() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void minStationTest() {
        Radio radio = new Radio(16);

        Assertions.assertEquals(0, radio.getMinStation());
    }

    @Test
    public void maxStationDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void amountStationTest() {
        Radio radio = new Radio(13);

        Assertions.assertEquals(13, radio.getAmountStation());
    }

    @Test
    public void amountStationDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getAmountStation());
    }

    @Test
    public void valuesMoreMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void valuesLessMinTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestAmount() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBecome0() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBecome9() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestAmount() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMoreMaxTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessMinTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doesNotIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void doeNotDecrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }
}
