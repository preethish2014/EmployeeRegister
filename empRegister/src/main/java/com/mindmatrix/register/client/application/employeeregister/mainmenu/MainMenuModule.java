package com.mindmatrix.register.client.application.employeeregister.mainmenu;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.mindmatrix.register.client.application.employeeregister.mainmenu.testpresenter.testPresenterModule;

public class MainMenuModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		install(new testPresenterModule());
		bindPresenter(MainMenuPresenter.class, MainMenuPresenter.MyView.class,
				MainMenuView.class, MainMenuPresenter.MyProxy.class);
	}
}
