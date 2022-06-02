package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int amountStation = 10;
    private int minStation;
    private int maxStation;
    private int currentStation;

    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getMaxStation() {
        maxStation = amountStation - 1;
        return maxStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > amountStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < amountStation - 1) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
        setCurrentStation(currentStation);
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = amountStation - 1;
        }
        setCurrentStation(currentStation);
    }

    // volume
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        setCurrentVolume(currentVolume);
    }
}


