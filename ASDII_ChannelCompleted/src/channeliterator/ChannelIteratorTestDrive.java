package channeliterator;

import domein.Channel;
import domein.ChannelCollection;
import domein.ChannelCollectionImpl;
import domein.ChannelIterator;
import domein.ChannelType;

public class ChannelIteratorTestDrive {

     public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
       ChannelIterator baseIterator = channels.createIterator(ChannelType.ALL);
        while (baseIterator.hasNext()) {
            Channel c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        ChannelIterator englishIterator = channels.createIterator(ChannelType.ENGLISH);
        while (englishIterator.hasNext()) {
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }
 
    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelType.HINDI));
        channels.addChannel(new Channel(100.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelType.HINDI));
        channels.addChannel(new Channel(103.5, ChannelType.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelType.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelType.HINDI));
        channels.addChannel(new Channel(106.5, ChannelType.FRENCH));
        return channels;
    }
    
}
