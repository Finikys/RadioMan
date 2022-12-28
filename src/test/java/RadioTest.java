import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maxNumberTest(){
        Radio rad = new Radio();

        rad.maxNumber(3);

        int expected = 3;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTest(){
        Radio rad = new Radio();

        rad.nextButton(4);

        int expected = 5;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTest(){
        Radio rad = new Radio();

        rad.prevButton(5);

        int expected = 4;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    //-------------------------------------------------VOLUME------------------------------------------------

    @Test
    public void maxVolumeTest(){
        Radio rad = new Radio();

        rad.maxVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonVolumeTest(){
        Radio rad = new Radio();

        rad.nextButtonVolume(6);

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTest(){
        Radio rad = new Radio();

        rad.prevButtonVolume(6);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    //-------------------------------------------------OptionalTests------------------------------------------------

    @Test
    public void maxNumberTestOver(){
        Radio rad = new Radio();

        rad.maxNumber(12);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxNumberTestMinus(){
        Radio rad = new Radio();

        rad.maxNumber(-32);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTestOver(){
        Radio rad = new Radio();

        rad.nextButton(9);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTestOver(){
        Radio rad = new Radio();

        rad.prevButton(0);

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestOver(){
        Radio rad = new Radio();

        rad.maxVolume(13);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestMin(){
        Radio rad = new Radio();

        rad.maxVolume(-31);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }



}
