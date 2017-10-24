package com.example.razzorowa.myapplication.model;

/**
 * Created by RazzorOwa on 19/10/2017.
 */

public class Category {
    private String nome;
    private int image_id;

    public Category(String nome, int image_id) {
        this.nome = nome;
        this.image_id = image_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
