package org.exercise.best.model;

public class Songs {
    // ATTRIBUTI
    private int id;
    private String title;

    // COSTRUTTORI

    public Songs(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Songs(){

    }

    // GETTER E SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
