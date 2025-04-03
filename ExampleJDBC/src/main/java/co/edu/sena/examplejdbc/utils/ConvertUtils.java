package co.edu.sena.examplejdbc.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Fecha: 03/04/2025
 * @author Juan Diego Orrego Vargas
 * Objetivo: clase para utileria de mensajes en pantalla
 */

public class ConvertUtils {
    
    public static String dateToString (Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String result = dateFormat.format(date);
        return result;
    }
    
    public static Date stringToDate (String text) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(text);
        return date;
    }
}
