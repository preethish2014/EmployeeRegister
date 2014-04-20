package com.mindmatrix.register.client.application.employeeregister;

import javax.inject.Inject;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import com.mindmatrix.register.shared.Employee;

public class EmployeeRegisterView extends ViewWithUiHandlers<DisplayEmployeeDetails> implements
		EmployeeRegisterPresenter.MyView {
	
	
	@UiField
	Label Name;
	@UiField
	TextBox empName;
	
	@UiField
	TextArea empAddress;
	
	
	
	Button addEmployee;

	public Label getName() {
		return Name;
	}

	public TextBox getEmpName() {
		return empName;
	}


	@UiField
	Label age;
	@UiField
	TextBox empAge;
	
	

	
	public Label getAge() {
		return age;
	}

	public TextBox getEmpAge() {
		return empAge;
	}

	interface Binder extends UiBinder<Widget, EmployeeRegisterView> {
		
		
	
	}


	@Inject
	EmployeeRegisterView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
		
		addEmployee.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				Employee employee = new Employee(empName.getName(),Integer.parseInt(empAge.getName()),empAddress.getName(),null , null);
				
				//employeeRegisterPresenter.addEmployeeDetails(employee);
			}
		});
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == EmployeeRegisterPresenter.SLOT_EmployeeRegister) {
//			main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}



}
