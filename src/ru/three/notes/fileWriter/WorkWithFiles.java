package ru.three.notes.fileWriter;

import ru.three.notes.terminal.Terminal;

import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    private Terminal terminal;
    private final String file = "src/ru/three/notes/fileWriter/notes.txt";

    {
        if (terminal == null) terminal = new Terminal();
    }

    public void write() {
        while (true) {
            String result = terminal.writeNote();
            try (FileWriter fw = new FileWriter(file, true)) {
                fw.write(result);
            } catch (IOException exception) {
                System.out.println("Ошибка при записи в файл");
                exception.printStackTrace();
            }
        }
    }
}
