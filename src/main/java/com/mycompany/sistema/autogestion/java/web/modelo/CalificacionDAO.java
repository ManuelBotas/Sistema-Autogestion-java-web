/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Botas
 */
public class CalificacionDAO implements	DAO<Calificacion, Integer> {
    private static int contador = 1;
    private static List<Calificacion> calificaciones;

    public void addCalificacion(Calificacion calificacion) {
        calificacion.setIdCalificacion(contador);
        calificaciones.add(calificacion);
        contador++;
    }
    
    @Override
    public void insertar(Calificacion entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modificar(Calificacion entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar(Calificacion id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Calificacion> listar() {
        return new ArrayList<>(this.calificaciones);
    }

    @Override
    public Calificacion buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}