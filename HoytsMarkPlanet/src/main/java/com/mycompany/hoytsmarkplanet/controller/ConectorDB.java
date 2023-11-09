/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoytsmarkplanet.controller;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

/**
 *
 * @author USRVI-LC5
 */
public class ConectorDB {

    private Connection conn;

    public ConectorDB() {
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void crearConexion() throws SQLException {
        // Make sure to have Oracle JDBC driver 18c or above 
        // to pass TNS_ADMIN as part of a connection URL.
        // TNS_ADMIN - Should be the path where the client credentials zip (wallet_dbname.zip) file is downloaded. 
        // dbname_medium - It is the TNS alias present in tnsnames.ora.
        final String DB_URL = "jdbc:oracle:thin:@proyecto3sebadani_high?TNS_ADMIN=./Wallet_Proyecto3SebaDani";
        //final String DB_URL = proyecto3sebadani_high = (description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.sa-santiago-1.oraclecloud.com))(connect_data=(service_name=g11479b1c172e9c_proyecto3sebadani_high.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes)))
        // Update the Database Username and Password to point to your Autonomous Database
        final String DB_USER = "admin";
        String DB_PASSWORD = "Proyecto.123456789";
        final String CONN_FACTORY_CLASS_NAME = "oracle.jdbc.pool.OracleDataSource";

        // For security purposes, you must enter the password through the console 
        
        // Get the PoolDataSource for UCP
        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();

        // Set the connection factory first before all other properties
        pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
        pds.setURL(DB_URL);
        pds.setUser(DB_USER);
        pds.setPassword(DB_PASSWORD);
        pds.setConnectionPoolName("JDBC_UCP_POOL");

        // Default is 0. Set the initial number of connections to be created
        // when UCP is started.
        pds.setInitialPoolSize(5);

        // Default is 0. Set the minimum number of connections
        // that is maintained by UCP at runtime.
        pds.setMinPoolSize(5);

        // Default is Integer.MAX_VALUE (2147483647). Set the maximum number of
        // connections allowed on the connection pool.
        pds.setMaxPoolSize(20);

        // Get the database connection from UCP.
        this.conn = pds.getConnection();
           

        System.out.println("Available connections after checkin: "
                + pds.getAvailableConnectionsCount());
        System.out.println("Borrowed connections after checkin: "
                + pds.getBorrowedConnectionsCount());
    }
}
