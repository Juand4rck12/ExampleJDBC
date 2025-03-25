package co.edu.sena.examplejdbc.controllers;

import co.edu.sena.examplejdbc.bd.DBEmployeeType;
import co.edu.sena.examplejdbc.model.EmployeeType;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Implementar la interface para controlar el modelo EmployeeType
 */

public class EmployeeTypeController implements IEmployeeTypeController {
    
    private DBEmployeeType dbe = new DBEmployeeType();

    @Override
    public void insert(EmployeeType employeeType) throws Exception {
        if (employeeType == null) {
            throw new Exception("El tipo de empleado es nulo");
        }
        
        if ("".equals(employeeType.getDescript())) {
            throw new Exception("La descripción es obligatoria");
        }
        
        // Insertar
        dbe.insert(employeeType);
    }

    @Override
    public void update(EmployeeType employeeType) throws Exception {
        if (employeeType == null) {
            throw new Exception("El tipo de empleado es nulo");
        }
        
        if (employeeType.getId() == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        if ("".equals(employeeType.getDescript())) {
            throw new Exception("La descripción es obligatoria");
        }
        
        // Consultar si el employeeType existe en la db
        EmployeeType employeeTypeExists = dbe.findById(employeeType.getId());
        if (employeeTypeExists == null) {
            throw new Exception("El tipo de empleado no existe");
        }
        
        // Actualizar
        dbe.update(employeeType);
    }

    @Override
    public void delete(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        // Consultar si el employeeType existe en la db
        EmployeeType employeeTypeExists = dbe.findById(id);
        if (employeeTypeExists != null) {
            throw new Exception("No existe el empleado");
        }
        
        // Eliminar
        dbe.delete(id);
    }

    @Override
    public List<EmployeeType> findAll() throws Exception {
        return dbe.findAll();
    }

    @Override
    public EmployeeType findById(int id) throws Exception {
        if (id == 0) {
            throw new Exception("El Id es obligatorio");
        }
        
        return dbe.findById(id);
    }
    
}
