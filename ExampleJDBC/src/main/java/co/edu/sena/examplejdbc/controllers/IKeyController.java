package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Fecha: 25/03/2025
 * @author Juan Diego
 * Objetivo: interface para el modelo Key
 */

public interface IKeyController {
    public void insert (Key key) throws Exception;
    
    public void update (Key key) throws Exception;
    
    public void delete (int id) throws Exception;
    
    public List<Key> findAll() throws Exception;
    
    public Key findById(int id) throws Exception;
}
