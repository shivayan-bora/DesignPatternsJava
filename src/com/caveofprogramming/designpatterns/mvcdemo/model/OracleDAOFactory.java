package com.caveofprogramming.designpatterns.mvcdemo.model;

public class OracleDAOFactory extends DAOFactory {
    @Override
    public PersonDAO getPersonDAO() {
        return new OraclePersonDAO();
    }

    @Override
    public LogDAO getLogDAO() {
        return new OracleLogDAO();
    }
}
