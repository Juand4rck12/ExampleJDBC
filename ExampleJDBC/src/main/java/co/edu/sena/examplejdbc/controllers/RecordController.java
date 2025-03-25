package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBRecord;
import co.edu.sena.examplejdbc.model.Record;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Implementar la interface para controlar el modelo Record
 */

public class RecordController implements IRecordController {
    
    private DBRecord dbr = new DBRecord();

    @Override
    public void insert(Record record) throws Exception {
        if (record == null) {
            throw new Exception("El registro es nulo");
        }
        
        if ("".equals(record.getDateRecord())) {
            throw new Exception("La fecha es obligatoria");
        }
        
        if ("".equals(record.getStartTime())) {
            throw new Exception("El inicio es obligatio");
        }
        
        // FK empleado
        if (record.getEmployeeId() == null ) {
            throw new Exception("El Id de empleado es obligatorio");
        }
        
        // FK key
        if (record.getKeyId() == null) {
            throw new Exception("El Id de llave es obligatorio");
        }
        
        if ("".equals(record.getStatus())) {
            throw new Exception("El estado es obligatorio");
        }
        
        dbr.insert(record);
    }

    @Override
    public void update(Record record) throws Exception {
        if (record == null) {
            throw new Exception("El registro es nulo");
        }
        
        if ("".equals(record.getDateRecord())) {
            throw new Exception("La fecha es obligatoria");
        }
        
        if ("".equals(record.getStartTime())) {
            throw new Exception("El inicio es obligatio");
        }
        
        // FK empleado
        if (record.getEmployeeId() == null ) {
            throw new Exception("El Id de empleado es obligatorio");
        }
        
        // FK key
        if (record.getKeyId() == null) {
            throw new Exception("El Id de llave es obligatorio");
        }
        
        if ("".equals(record.getStatus())) {
            throw new Exception("El estado es obligatorio");
        }
        
        dbr.update(record);
    }

    @Override
    public void delete(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        Record recordExists = dbr.findById(id);
        if (recordExists == null) {
            
        }
        
        dbr.delete(id);
    }

    @Override
    public List<Record> findAll() throws Exception {
        return dbr.findAll();
    }

    @Override
    public Record findById(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        return dbr.findById(id);        
    }
    
}
