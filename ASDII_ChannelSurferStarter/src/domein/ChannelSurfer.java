package domein;

public class ChannelSurfer implements Surfer {

	private int current;
	private int aantalChannels;

	public Channel next() {
		current = (current+1)%aantalChannels;
		return new Channel(current);
	}

	public Channel previous() {
		current = (current - 1 + aantalChannels)%aantalChannels;
		return new Channel(current);
	}

	public ChannelSurfer(int aantalChannels) {
		this.aantalChannels=aantalChannels;
	}
}
