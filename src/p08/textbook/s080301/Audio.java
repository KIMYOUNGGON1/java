package p08.textbook.s080301;

import p08.textbook.s080205.RemoteControl;

public class Audio implements RemoteControl {
	
	private int Volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");	
	}
	
	@Override
	public void setVolume(int Volume) {
		if(Volume>RemoteControl.MAX_VOLUME) {
			this.Volume = RemoteControl.MAX_VOLUME; 
		} else if (Volume < RemoteControl.MIN_VOLUME) {
			this.Volume = RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = Volume;
		}
		
		System.out.println("현재 Audio 볼륨: " + this.Volume);
	}
}
