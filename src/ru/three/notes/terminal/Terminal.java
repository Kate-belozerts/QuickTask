package ru.three.notes.terminal;

import java.util.Date;
import java.util.Scanner;

public class Terminal {
    public String writeNote() {
        Menu.start();
        String note = new Scanner(System.in).nextLine();
        return note + "   created  -->   " + new Date() + "\n";
    }
}
