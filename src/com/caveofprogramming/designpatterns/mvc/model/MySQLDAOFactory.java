package com.caveofprogramming.designpatterns.mvc.model;

public class MySQLDAOFactory extends DAOFactory {
	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.mvc.model.DAOFactory#getPersonDAO()
	 */
	@Override
	public PersonDAO getPersonDAO() {
		return new MySQLPersonDAO();
	}
	
	/* (non-Javadoc)
	 * @see com.caveofprogramming.designpatterns.mvc.model.DAOFactory#getLogDAO()
	 */
	@Override
	public LogDAO getLogDAO() {
		return new MySQLLogDAO();
	}
}
