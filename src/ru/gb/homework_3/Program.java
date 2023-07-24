package ru.gb.homework_3;

import java.util.*;

public class Program {

    static Controller ctrl = new Controller();
    static List<Stream> streams = new ArrayList<>();
    static List<StudyGroup> groups = new ArrayList<>();

    public static void main(String[] args) {

        groups.add(new StudyGroup("Группа 1"));
        groups.add(new StudyGroup("Группа 2"));
        groups.add(new StudyGroup("Группа 3"));
        groups.add(new StudyGroup("Группа 4"));

        streams.add(new Stream(groups));
        streams.add(new Stream(groups));
        streams.add(new Stream(groups));
        streams.add(new Stream(groups));

        for(var stream : streams){
            ctrl.addStream(stream);
        }

        ctrl.sortStream();
        var sortedStreams = ctrl.getStreams();

        int i = 0;
        for (var stream : sortedStreams){
            i++;
            System.out.printf("\nПоток %d:\n", i);
            for (var group : stream.getGroups()){
                System.out.printf("\t %s\n", group.getName());
            }
        }
    }
}
