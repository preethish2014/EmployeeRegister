package com.mindmatrix.register.client.application.employeeregister;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.mindmatrix.register.client.application.employeeregister.mainmenu.MainMenuModule;


public class EmployeeRegisterModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		
		install(new MainMenuModule());
		bindPresenter(EmployeeRegisterPresenter.class,
				EmployeeRegisterPresenter.MyView.class,
				EmployeeRegisterView.class,
				EmployeeRegisterPresenter.MyProxy.class);
	}
}
