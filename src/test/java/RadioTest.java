import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void maxNumberTest() {
        Radio rad = new Radio();

        rad.setCurrentNumber(3);

        int expected = 3;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTest() {
        Radio rad = new Radio();

        rad.setCurrentNumber(4);

        rad.nextButton();

        int expected = 5;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTest() {
        Radio rad = new Radio();

        rad.setCurrentNumber(4);

        rad.prevButton();

        int expected = 3;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    //-------------------------------------------------VOLUME------------------------------------------------

    @Test
    public void maxVolumeTest() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonVolumeTest() {
        Radio rad = new Radio();

        rad.setSoundVolume(6);

        rad.nextButtonVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTest() {
        Radio rad = new Radio();

        rad.setSoundVolume(6);

        rad.prevButtonVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    //-------------------------------------------------OptionalTests------------------------------------------------

    @Test
    public void maxNumberTestOver() {
        Radio rad = new Radio();

        rad.setCurrentNumber(12);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxNumberTestMinus() {
        Radio rad = new Radio();

        rad.setCurrentNumber(-32);

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonTestOver() {
        Radio rad = new Radio();

        rad.setCurrentNumber(9);

        rad.nextButton();

        int expected = 0;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonTestOver() {
        Radio rad = new Radio();

        rad.setCurrentNumber(0);

        rad.prevButton();

        int expected = 9;
        int actual = rad.getCurrentNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestOver() {
        Radio rad = new Radio();

        rad.setSoundVolume(13);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxVolumeTestMin() {
        Radio rad = new Radio();

        rad.setSoundVolume(-31);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextButtonVolumeTestOver() {
        Radio rad = new Radio();

        rad.setSoundVolume(10);

        rad.nextButtonVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevButtonVolumeTestMin() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);

        rad.prevButtonVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
