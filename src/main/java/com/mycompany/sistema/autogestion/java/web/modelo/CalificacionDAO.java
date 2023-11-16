/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.autogestion.java.web.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Manuel Botas
 */
public class CalificacionDAO implements	DAO<Calificacion, Integer> {

    @Override
    public void insertar(Calificacion entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar(Calificacion entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Calificacion id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Calificacion> listar() {
        List<Calificacion> calificaciones = new LinkedList<>();
        String query = "SELECT * FROM calificacion";
        try(Connection con = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery()) {
            while(rs.next()) {
                calificaciones.add(rsRowToCalificacion(rs));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return calificaciones;
    }

    public List<Calificacion> listar(int idAlumno) {
        List<Calificacion> calificaciones = new LinkedList<>();
        String query = "SELECT * FROM calificacion" + 
                       "INNER JOIN alumno a ON c.id_alumno = a.id_alumno" +
                       "WHERE a.id_alumno = ?";
        try(Connection con = ConnectionPool.getInstance().getConnection();
            PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, idAlumno);
            try(ResultSet rs = ps.executeQuery()) {
                while(rs.next()) {
                    calificaciones.add(rsRowToCalificacion(rs));
                }
            } catch(SQLException ex) {
                throw new RuntimeException(ex);
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return calificaciones;
    }

    private Calificacion rsRowToCalificacion(ResultSet rs) {
        try {
            int idCalificacion = rs.getInt("id_calificacion");
            int nota = rs.getInt("nota");
            int numExamen = rs.getInt("num_examen");
            int idAlumno = rs.getInt("id_alumno");
            int idMateria = rs.getInt("id_materia");
            return new Calificacion(idCalificacion, nota, numExamen, idAlumno, idMateria);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Calificacion buscar(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    /*private static int contador = 1;
    private List<Calificacion> calificaciones;

    public CalificacionDAO() {
        this.calificaciones = new ArrayList<>();
        insertarCalificaciones();
    }
    
    @Override
    public void insertar(Calificacion calificacion) {
        calificacion.setIdCalificacion(contador);
        calificaciones.add(calificacion);
        contador++;
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

    private void insertarCalificaciones() {
        insertar(new Calificacion(contador, 8, 1, "Lengua"));
        insertar(new Calificacion(contador, 6, 2, "Lengua"));
        insertar(new Calificacion(contador, 7, 1, "Historia"));
        insertar(new Calificacion(contador, 6, 1, "Educación Física"));
        insertar(new Calificacion(contador, 8, 1, "Historia"));
        insertar(new Calificacion(contador, 6, 2, "Biología"));
        insertar(new Calificacion(contador, 3, 3, "Matemáticas"));
        insertar(new Calificacion(contador, 0, 2, "Educación Física"));
        insertar(new Calificacion(contador, 10, 1, "Química"));
        insertar(new Calificacion(contador, 8, 1, "Geografía"));
        insertar(new Calificacion(contador, 8, 3, "Historia"));
        insertar(new Calificacion(contador, 7, 3, "Matemáticas"));
        insertar(new Calificacion(contador, 1, 2, "Matemáticas"));
    }*/
}
