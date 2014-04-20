package com.mindmatrix.register.client.application.employeeregister.mainmenu;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class MainMenuView extends ViewImpl implements MainMenuPresenter.MyView {
	interface Binder extends UiBinder<Widget, MainMenuView> {
	}


	@UiField
	HTMLPanel main;
	@UiField
	Button addEmployee;
	@UiField
	Button viewEmployeeList;

	@Inject
	MainMenuView(Binder uiBinder) {
		
		initWidget(uiBinder.createAndBindUi(this));
		
				
	}

	public Button getAddEmployee() {
		return addEmployee;
	}

	public Button getViewEmployeeList() {
		return viewEmployeeList;
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == MainMenuPresenter.SLOT_MainMenu) {
		//main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
	

	
}
