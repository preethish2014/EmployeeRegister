package com.mindmatrix.register.client.application.employeeregister;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
//import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.mindmatrix.register.client.place.NameTokens;
import com.mindmatrix.register.shared.Employee;
import com.mindmatrix.register.shared.EmployeeDB;

public class EmployeeRegisterPresenter
		extends
		Presenter<EmployeeRegisterPresenter.MyView, EmployeeRegisterPresenter.MyProxy>  implements DisplayEmployeeDetails{
	interface MyView extends View {
		
		
		public Label getName();
		public TextBox getEmpName() ;
		public Label getAge();
		public TextBox getEmpAge();
	
		
	}

	
	@Inject
	
	EmployeeDB employeeDB;
	
	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_EmployeeRegister = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.employee)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<EmployeeRegisterPresenter> {
		
	
	}

	@Inject
	public EmployeeRegisterPresenter(EventBus eventBus, MyView view,
			MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}
	
	public void addEmployeeDetails(Employee employee)
	{
		
		employeeDB.addEmployeeDetails(employee);
		
				
	}

	protected void onReset() {
		
		//getView().getEmpAge()
		
		
		super.onReset();
	}

}
