public class Radio {
    private int currentNumber;
    private int soundVolume;

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void nextButton() {
        if (currentNumber < 9) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prevButton() {
        if (currentNumber > 0) {
            currentNumber--;
        } else {
            currentNumber = 9;
        }
    }

    // -------------------------------------------------VOLUME-----------------------------------------------

    public int getCurrentVolume() {
        return soundVolume;
    }

    public void nextButtonVolume() {
        if (soundVolume < 10) {
            soundVolume++;
        }
    }

    public void prevButtonVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }

}
