package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBKey;
import co.edu.sena.examplejdbc.model.Key;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Implementar la interface para controlar el modelo Key
 */

public class KeyController implements IKeyController {
    
    private DBKey dbk = new DBKey();

    @Override
    public void insert(Key key) throws Exception {
        if (key == null) {
            throw new Exception("La llave es nula");
        }
        
        if (key.getId() == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        if ("".equals(key.getName())) {
            throw new Exception("El nombre es obligatorio");
        }
        
        if ("".equals(key.getRoom())) {
            throw new Exception("El room es obligatorio");
        }
        
        if (key.getCount() < 1) {
            throw new Exception("El número de llaves es obligatorio");
        }
        
        // Insertar
        dbk.insert(key);
    }

    @Override
    public void update(Key key) throws Exception {
        if (key == null) {
            throw new Exception("La llave es nula");
        }
        
        if (key.getId() == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        if ("".equals(key.getName())) {
            throw new Exception("El nombre es obligatorio");
        }
        
        if ("".equals(key.getRoom())) {
            throw new Exception("El room es obligatorio");
        }
        
        if (key.getCount() < 1) {
            throw new Exception("El número de llaves es obligatorio");
        }
        
        // Consultar si la key existe en la db
        Key keyExists = dbk.findById(key.getId());
        if (keyExists == null) {
            throw new Exception("La llave no existe");
        }
        
        // Actualizar
        dbk.update(key);
    }

    @Override
    public void delete(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        // Consultar si la llave existe en la db
        Key keyExists = dbk.findById(id);
        if (keyExists == null) {
            throw new Exception("No existe la llave");
        }
        
        dbk.delete(id);
    }

    @Override
    public List<Key> findAll() throws Exception {
        return dbk.findAll();
    }

    @Override
    public Key findById(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        return dbk.findById(id);
    }
    
}
