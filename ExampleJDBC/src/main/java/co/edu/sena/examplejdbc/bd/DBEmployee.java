/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.bd;

import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fecha: 13/03/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: Permite consultas y transacciones en la tabla employee
 */

public class DBEmployee extends DBConnection {
    public void insert(Employee employee) {
        try {
            connect();
            String sql = "INSERT INTO employee VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, employee.getDocument());
            preparedStatement.setString(2, employee.getFullname());
            preparedStatement.setString(3, employee.getAddress());
            preparedStatement.setString(4, employee.getPhone());
            preparedStatement.setInt(5, employee.getEmployeeType().getId());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al insertar el empleado " + e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void update(Employee employee) {
        try {
            connect();
            String sql = "UPDATE employee SET fullname = ?, direccion = ?, telefono = ?, type_id = ? "
                        + "WHERE document = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getFullname());
            preparedStatement.setString(2, employee.getAddress());
            preparedStatement.setString(3, employee.getPhone());
            preparedStatement.setInt(4, employee.getEmployeeType().getId());
            preparedStatement.setLong(5, employee.getDocument());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al actualizar el empleado " + e.getMessage());
        } finally {
            disconnect();
        }
    }
    
    public void delete (long document) {
        try {
            connect();
            String sql = "DELETE FROM employee WHERE document = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, document);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            
        } catch (Exception e) {
            MessageUtils.showErrorMessage("Error al eliminar el empleado " + e.getMessage());
            
        } finally {
            disconnect();
        }
    }
    
    public List<Employee> findAll() {
        List<Employee> results = new ArrayList<>();
        DBEmployeeType dbet = new DBEmployeeType();
        
        try {
            connect();
            String sql = "SELECT * FROM employee";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            // .next para recorrer todos los resultados
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setDocument(resultSet.getLong("document"));
                employee.setFullname(resultSet.getString("fullname"));
                employee.setAddress(resultSet.getString("direccion"));
                employee.setPhone(resultSet.getString("telefono"));
                
                //FK
                EmployeeType employeeType = dbet.findById(resultSet.getInt("type_id"));
                employee.setEmployeeType(employeeType);
                
                results.add(employee);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipos de empleados " 
                                          + e.getMessage());
        } finally {
            disconnect();
        }
        
        return results;
    }
    
    public Employee findById(long document) {
        
        Employee employee = null;
        DBEmployeeType dbet = new DBEmployeeType();
        
        try {
            connect();
            String sql = "SELECT * FROM employee WHERE document = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, document);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            // .next para recorrer todos los resultados
            if (resultSet.next()) {
                employee = new Employee();
                employee.setDocument(resultSet.getLong("document"));
                employee.setFullname(resultSet.getString("fullname"));
                employee.setAddress(resultSet.getString("direccion"));
                employee.setPhone(resultSet.getString("telefono"));
                
                //FK
                EmployeeType employeeType = dbet.findById(resultSet.getInt("type_id"));
                employee.setEmployeeType(employeeType);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al consultar tipo de empleados " 
                                          + e.getMessage());
        } finally {
            disconnect();
        }
        
        return employee;
    }
}
