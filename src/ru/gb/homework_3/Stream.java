package ru.gb.homework_3;

import java.util.*;
import java.util.function.Consumer;

public class Stream implements Iterable<StudyGroup>{

    private List<StudyGroup> _groups;

    public Stream(List<StudyGroup> groups){
        _groups = groups;
    }

    public List<StudyGroup> getGroups(){
        return _groups;
    }
    public void addGroup(StudyGroup newGroup){
        _groups.add(newGroup);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return _groups.iterator();
    }

    @Override
    public void forEach(Consumer<? super StudyGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<StudyGroup> spliterator() {
        return Iterable.super.spliterator();
    }
}
