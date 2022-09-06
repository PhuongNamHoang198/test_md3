package com.codegym.connection;

import java.sql.Connection;

public class ConnectionJDBC {
    private Connection connection ;

    public static ConnectionJDBC instance = null;

    private ConnectionJDBC(){}

    public static ConnectionJDBC getInstance(){

    }
}
