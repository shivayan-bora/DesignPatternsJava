package com.caveofprogramming.designpatterns.mvcdemo.controller;

import java.sql.SQLException;

import com.caveofprogramming.designpatterns.mvcdemo.model.*;
import com.caveofprogramming.designpatterns.mvcdemo.view.CreateUserEvent;
import com.caveofprogramming.designpatterns.mvcdemo.view.CreateUserListener;
import com.caveofprogramming.designpatterns.mvcdemo.view.View;

public class Controller implements CreateUserListener {
	private View view;
	private Model model;




	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void userCreated(CreateUserEvent event) {
        DAOFactory factory = DAOFactory.getDAOFactory(0);
        PersonDAO personDAO = factory.getPersonDAO();

        System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());

		try {
            personDAO.addPerson(new Person(event.getName(), event.getPassword()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
