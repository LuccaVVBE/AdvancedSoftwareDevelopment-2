package domein;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection 
{
    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator createIterator(ChannelType type) {
        return new ChannelIteratorImpl(type, channelsList);
    }
    
    //Met java.util.iterator
    /*public Iterator<Channel> createIterator(ChannelType type){
     	List<Channel> list = new ArrayList<>(channelsList);
     	if (type != ChannelType.ALL)
     	          list = list.stream().filter(channel -> channel.getTYPE()==type).toList();
     	return list.iterator();
     }*/
}
