package com.caveofprogramming.designpatterns.mvc.controller;

import com.caveofprogramming.designpatterns.mvc.model.Database;
import com.caveofprogramming.designpatterns.mvc.model.Model;
import com.caveofprogramming.designpatterns.mvc.model.Person;
import com.caveofprogramming.designpatterns.mvc.view.AppListener;
import com.caveofprogramming.designpatterns.mvc.view.CreateUserEvent;
import com.caveofprogramming.designpatterns.mvc.view.CreateUserListener;
import com.caveofprogramming.designpatterns.mvc.view.SaveListener;
import com.caveofprogramming.designpatterns.mvc.view.View;

public class Controller implements CreateUserListener, SaveListener,
		AppListener {
	private View view;
	private Model model;

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void onUserCreated(CreateUserEvent event) {
		model.addPerson(new Person(event.getName(), event.getPassword()));
	}

	@Override
	public void onSave() {
		try {
			model.save();
		} catch (Exception e) {
			view.showError("Error saving to database.");
		}
	}

	@Override
	public void onOpen() {
		try {
			Database.getInstance().connect();
		} catch (Exception e) {
			view.showError("Cannot connect to database.");
		}
		
		try {
			model.load();
		} catch (Exception e) {
			view.showError("Error loading data from database.");
		}
	}

	@Override
	public void onClose() {
		Database.getInstance().disconnect();
	}

}
