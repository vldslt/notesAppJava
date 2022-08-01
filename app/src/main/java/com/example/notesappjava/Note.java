package com.example.notesappjava;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.time.LocalDateTime;
import java.util.Random;

class Note {

    private static final Random random = new Random();
    private static Note[] notes;

    private String title;
    private String description;
    private LocalDateTime datetime;

    public void setTitle(String title) {this.title = title;}
    public void setDescription(String description){this.description = description;}
    public void setDatetime(LocalDateTime datetime) {this.datetime = datetime;}

    public static Note[] getNotes() {return notes;}

    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public LocalDateTime getDatetime() {return datetime;}

    static {
        notes = new Note[10];
        for (int i = 0; i < notes.length; i++) {
            notes[i] = Note.getNote(i);
        }
    }

    public Note(String title, String description,LocalDateTime datetime) {
        this.title = title;
        this.description = description;
        this.datetime = datetime;
    }

    @SuppressLint("DefaultLocale")
    public static Note getNote(int index) {
        String title = String.format("Заметка %d", index);
        String description = String.format("Описание заметки %d", index);
        LocalDateTime dateTime = LocalDateTime.now().plusDays(-random.nextInt(5));
        return new Note(title, description, dateTime);
    }

}

