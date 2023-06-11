/**
 * Name: Humna Sultan
 * Program Name: Television Lab
 * Date: 23 September 2019
 * Extra: tells user that they can get a lollipop from Mr.
 Hendricks' desk if they enter channel 21
 */
package television;
//package
public class Television
//class name

{
    private String MANUFACTURER; //the maker of the television
    private double SCREEN_SIZE; //the size of the television
    private boolean powerOn; //contains true if the TV power is on
    private int channel; //the numeric station setting
    private int volume; //the numeric level of the sound
    public Television(String brand, double size)
    {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
    }

    public int getVolume()
    {
        return volume;
    }
    //returns volume
    public void setChannel(int station)
    {
        channel = station;
    }
//sets channel
    /**toggles the power on and off*/
    public void power()
    {
        powerOn = !powerOn;
    }
    /**increases the volume by one*/
    public void increaseVolume()
    {
        volume++;
    }
    public void decreaseVolume()
    {
        volume--;
    }
    //decreases volume
    public int getChannel()
    {
        return channel;
    }
    //returns channel
    public String getManufacturer()
    {

        return MANUFACTURER;
    }
    //returns manufacturer
    public double getScreenSize()
    {
        return SCREEN_SIZE;
    }
//returns screen size
}