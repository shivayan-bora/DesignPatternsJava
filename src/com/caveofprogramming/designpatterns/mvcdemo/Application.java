package com.caveofprogramming.designpatterns.mvcdemo;

import javax.swing.SwingUtilities;

import com.caveofprogramming.designpatterns.mvcdemo.controller.Controller;
import com.caveofprogramming.designpatterns.mvcdemo.model.Model;
import com.caveofprogramming.designpatterns.mvcdemo.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				runApp();
			}
			
		});
	}
	
	public static void runApp() {
		Model model = new Model();
		View view = new View(model);

		Controller controller = new Controller(view, model);
		
		view.setLoginListener(controller);
	}

}
