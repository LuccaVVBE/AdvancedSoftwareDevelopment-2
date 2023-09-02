package domein;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelType type;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelType type, List<Channel> channelsList) {
        this.type = type;
        this.channels = channelsList;
        if (this.type != ChannelType.ALL)
        	channels = channels.stream().filter(channel -> channel.getTYPE() == type).toList();
    }

    @Override
    public boolean hasNext() { 
    	return (position < channels.size()); 
    }

    @Override
    public Channel next() {
        return channels.get(position++);
    }

}