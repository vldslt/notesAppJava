package com.example.notesappjava;

class MyConfig implements Iconfig{

    String color;
    int height;
    int lenght;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getLength() {
        return lenght;
    }
}

class ConfigFluent implements IconfigFluent{

    String color;
    int height;
    int lenght;

    @Override
    public IconfigFluent SetColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public IconfigFluent SetHeight(int height) {
        this.height = height;
        return this;
    }

    @Override
    public IconfigFluent SetLenght(int lenght) {
        this.lenght = lenght;
        return this;
    }
}