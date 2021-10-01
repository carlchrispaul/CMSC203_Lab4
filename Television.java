/**
 * The purpose of this class is to model a television
 * @author carlchrispaul 09/30/2021
 */
public class Television {
	private String MANUFACTURER;
	private int SCREEN_SIZE;
	private boolean powerOn = false;
	private int channel = 2;
	private int volume = 20;
	
	//Constructor
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	//Channel setter
	public void setChannel(int station) {
		channel = station;
	}
	
	//Toggle power
	public void power() {
		powerOn = !powerOn;
	}
	
	//Add volume
	public void increaseVolume() {
		volume++;
	}
	
	//Subtract volume
	public void decreaseVolume() {
		volume--;
	}
	
	//Get channel
	public int getChannel() {
		return channel;
	}
	
	//Get volume
	public int getVolume() {
		return volume;
	}
	
	//Get manufacturer
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	//Get screen size
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
