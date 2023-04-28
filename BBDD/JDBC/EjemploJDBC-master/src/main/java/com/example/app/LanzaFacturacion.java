package com.example.app;



import java.sql.*;



public class LanzaFacturacion {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/facturacionllamadas";
        String usuario = "root";
        String contraseña = "Gaditanox10!MySQL";


        int idCliente = 123; // id del cliente a facturar

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             CallableStatement cs = conexion.prepareCall("{call facturacion_llamadas(?)}")) {

            cs.setInt(1, idCliente);
            cs.execute();
            System.out.println("Facturación de llamadas completada para el cliente " + idCliente);


        } catch (SQLException e) {
            System.err.println("Error al facturar las llamadas: " + e.getMessage());

        }
    }
}