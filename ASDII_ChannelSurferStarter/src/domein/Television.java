package domein;

public class Television {

    //TODO attributes


    public Television(int maxChannel) {
        //TODO
    	surfer = new ChannelSurfer(maxChannel);
    }

    public Program getNextProgram() {
        //TODO
        return surfer.next().getCurrentProgram();
    }

    public Program getPrevProgram() {
        //TODO
        return surfer.previous().getCurrentProgram();
    }

	private Surfer surfer;

}
