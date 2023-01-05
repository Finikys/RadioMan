public class Radio {
    public int currentNumber;
    public int soundVolume;
    public int maxCurrentNumber = 9;

    public Radio(int Numbers){
        this.maxCurrentNumber = Numbers-1;
    }

    public int getCurrentNumber(){
        return currentNumber;
    }

    public void  maxNumber(int newCurrentNumber){
        if (newCurrentNumber < 0){
            return;
        }
        if (newCurrentNumber > maxCurrentNumber){
            return;
        }

        currentNumber = newCurrentNumber;
    }

    public int nextButton(int newCurrentNumber){
        if (newCurrentNumber < maxCurrentNumber) {
            newCurrentNumber = newCurrentNumber + 1;
        }
        else {
            newCurrentNumber = 0;
        }
        currentNumber = newCurrentNumber;
        return currentNumber;
    }

    public int prevButton(int newCurrentNumber){
        if (newCurrentNumber > 0) {
            newCurrentNumber = newCurrentNumber - 1;
        }
        else {
            newCurrentNumber = maxCurrentNumber;
        }
        currentNumber = newCurrentNumber;
        return currentNumber;
    }

    // -------------------------------------------------VOLUME-----------------------------------------------

    public int getCurrentVolume(){
        return soundVolume;
    }
    public void  maxVolume(int newCurrentVolume){
        if (newCurrentVolume < 0){
            return;
        }
        if (newCurrentVolume > 100){
            return;
        }

        soundVolume = newCurrentVolume;
    }

    public int nextButtonVolume(int newCurrentVolume){
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        else {
            newCurrentVolume = 0;
        }
        soundVolume = newCurrentVolume;
        return soundVolume;
    }

    public int prevButtonVolume(int newCurrentVolume){
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        }
        else {
            newCurrentVolume = 0;
        }
        soundVolume = newCurrentVolume;
        return soundVolume;
    }

}
