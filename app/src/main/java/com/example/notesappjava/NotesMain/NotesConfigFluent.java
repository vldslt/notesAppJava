package com.example.notesappjava.NotesMain;

import java.sql.Date;

public interface NotesConfigFluent {
    NotesConfigFluent setName(String name);
    NotesConfigFluent setDescription(String description);
    NotesConfigFluent setDatetime(Date datetime);
    NotesConfigFluent setFormat(String format);
    NotesConfigFluent setBase(String base);
}
