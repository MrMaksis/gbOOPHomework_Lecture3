package ru.gb.homework_3;

import java.util.List;

public class StreamService {
    StreamComparator comparator = new StreamComparator();
    public void sortStreams(List<Stream> streams){
        streams.sort(comparator);
    }
}
