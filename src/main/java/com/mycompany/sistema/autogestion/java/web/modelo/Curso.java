/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

/**
 *
 * @author Francisco
 */
public class Curso {
    private int id_cursada;
    private String id_curso;

    public Curso(int id_cursada, String id_curso) {
        this.id_cursada = id_cursada;
        this.id_curso = id_curso;
    }

    public int getId_cursada() {
        return id_cursada;
    }

    public String getId_curso() {
        return id_curso;
    }

    public void setId_cursada(int id_cursada) {
        this.id_cursada = id_cursada;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }
    
}
