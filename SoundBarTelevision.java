package workfinal;

public class SoundBarTelevision extends Television {

	public SoundBarTelevision(double width, double height, double screenSize) {
		super(width, height, screenSize);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double channelTuning(int channel) {
		System.out.println("Remote button");
		switch(channel) {
		case 1:return 34.56;
		case 2:return 54.89;
		case 3:return 73.89;
		case 4:return 94.98;
		}
		return 0;
	}
	public void soundQuality() {
		System.out.println("5.1 Sound System");
	}
}

