package com.example.notesappjava.NotesMain;

import java.sql.Date;

class Notes implements NotesConfigFluent {

    String name;
    String description;
    Date datetime;
    String format;
    String base;

    @Override
    public NotesConfigFluent setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public NotesConfigFluent setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public NotesConfigFluent setDatetime(Date datetime) {
        this.datetime = datetime;
        return this;
    }

    @Override
    public NotesConfigFluent setFormat(String format) {
        this.format = format;
        return this;
    }

    @Override
    public NotesConfigFluent setBase(String base) {
        this.base = base;
        return this;
    }
}
