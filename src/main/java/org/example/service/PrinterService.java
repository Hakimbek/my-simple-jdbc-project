package org.example.service;

import org.example.dto.Printer;
import org.example.jdbc.ConnectionDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrinterService {
    public static ArrayList<Printer> getPrinter() throws SQLException {
        ArrayList<Printer> printerArrayList = new ArrayList<>();
        ResultSet resultSet = ConnectionDb.getConnection("printer");
        if (resultSet != null) {
            while (resultSet.next()) {
                Integer code = resultSet.getInt(1);
                String model = resultSet.getString(2);
                String color = resultSet.getString(3);
                String type = resultSet.getString(4);
                Double price = resultSet.getDouble(5);
                Printer printer = new Printer(code, model, color, type, price);
                printerArrayList.add(printer);
            }
            return printerArrayList;
        }
        return null;
    }
}
