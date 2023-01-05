import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    int Numbers = 15;
    int minusNumber = Numbers - 1;
    int plusNumber = Numbers + 1;
    @Test
    public void maxNumberTest(){
        Radio rad = new Radio(Numbers);

        rad.maxNumber(3);

        int expected = 3;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTest(){
        Radio rad = new Radio(Numbers);

        rad.nextButton(4);

        int expected = 5;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTest(){
        Radio rad = new Radio(Numbers);

        rad.prevButton(5);

        int expected = 4;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    //-------------------------------------------------VOLUME------------------------------------------------

    @Test
    public void maxVolumeTest(){
        Radio rad = new Radio(Numbers);

        rad.maxVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonVolumeTest(){
        Radio rad = new Radio(Numbers);

        rad.nextButtonVolume(56);

        int expected = 57;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTest(){
        Radio rad = new Radio(Numbers);

        rad.prevButtonVolume(78);

        int expected = 77;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    //-------------------------------------------------OptionalTests------------------------------------------------

    @Test
    public void maxNumberTestOver(){
        Radio rad = new Radio(Numbers);

        rad.maxNumber(Numbers + 3);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxNumberTestMinus(){
        Radio rad = new Radio(Numbers);

        rad.maxNumber(-32);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTestOver(){
        Radio rad = new Radio(Numbers);

        rad.nextButton(rad.maxCurrentNumber);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTestOver(){
        Radio rad = new Radio(Numbers);

        rad.prevButton(0);

        int expected = rad.maxCurrentNumber;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestOver(){
        Radio rad = new Radio(Numbers);

        rad.maxVolume(123);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestMin(){
        Radio rad = new Radio(Numbers);

        rad.maxVolume(-123);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonVolumeTestOver(){
        Radio rad = new Radio(Numbers);

        rad.nextButtonVolume(612);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTestMin(){
        Radio rad = new Radio(Numbers);

        rad.prevButtonVolume(-123);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
