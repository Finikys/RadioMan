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

        rad.nextButtonVolume(4);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTest(){
        Radio rad = new Radio();

        rad.prevButtonVolume(5);

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
