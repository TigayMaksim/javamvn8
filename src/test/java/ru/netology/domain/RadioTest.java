package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void currentStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(6);
        int actual = cond.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void currentStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(-5);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void currentStation2() {
        Radio cond = new Radio();
        cond.setCurrentStation(20);
        int actual = cond.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void nextStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setNextStation();
        int actual = cond.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);

    }

    @Test
    void nextStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(9);
        cond.setNextStation();
        int actual = cond.getNextStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio cond = new Radio();
        cond.setCurrentStation(5);
        cond.setPrevStation();
        int actual = cond.getPrevStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void prevStation1() {
        Radio cond = new Radio();
        cond.setCurrentStation(0);
        cond.setPrevStation();
        int actual = cond.getPrevStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(5);
        int actual = cond.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-5);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(101);
        int actual = cond.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void plusVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);
        cond.setPlusVolume();
        int actual = cond.getPlusVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume1() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(50);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    void minusVolume3() {
        Radio cond = new Radio();
        cond.setCurrentVolume(500);
        cond.setMinusVolume();
        int actual = cond.getMinusVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

}
