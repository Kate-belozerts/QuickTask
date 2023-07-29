package ru.three.notes;

import ru.three.notes.fileWriter.WorkWithFiles;

public class Main {
    public static void main(String[] args) {
        WorkWithFiles fileWriter = new WorkWithFiles();
        fileWriter.write();
    }
}
