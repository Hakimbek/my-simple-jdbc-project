package org.example.service;

import org.example.dto.PC;
import org.example.jdbc.ConnectionDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PcService {
    public static ArrayList<PC> getPc() throws SQLException {
        ArrayList<PC> pcArrayList = new ArrayList<>();
        ResultSet resultSet = ConnectionDb.getConnection("pc");
        if (resultSet != null) {
            while (resultSet.next()) {
                Integer code = resultSet.getInt(1);
                String model = resultSet.getString(2);
                Integer speed = resultSet.getInt(3);
                Integer ram = resultSet.getInt(4);
                Integer hd = resultSet.getInt(5);
                String cd = resultSet.getString(6);
                Double price = resultSet.getDouble(7);
                PC pc = new PC(code, model, speed, ram, hd, cd, price);
                pcArrayList.add(pc);
            }
            return pcArrayList;
        }
        return null;
    }
}
