package ru.gb.homework_3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.getGroups().size(), stream2.getGroups().size());
    }
}
