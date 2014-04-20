package com.mindmatrix.register.client.application.employeeregister.mainmenu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
//import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.mindmatrix.register.client.place.NameTokens;

public class MainMenuPresenter extends
		Presenter<MainMenuPresenter.MyView, MainMenuPresenter.MyProxy> {
	interface MyView extends View {

		public Button getAddEmployee();

		public Button getViewEmployeeList();
	}

	
	@Inject
	PlaceManager placeManager;
	
	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_MainMenu = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.menu)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<MainMenuPresenter> {
	}

	@Inject
	public MainMenuPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	@Override
	protected void onBind() {

		getView().getAddEmployee().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				viewEmployeeRegister();
			}
		});

		getView().getViewEmployeeList().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				viewEmployeeList();
			}
		});
	};

	

	// To navigate to employee register where employee details are get added

	public void viewEmployeeRegister() {

		PlaceRequest request = new PlaceRequest(NameTokens.employee);
		placeManager.revealPlace(request);
	}

	// to display the Already added employee details

	public void viewEmployeeList() {
		// Navigate to display details page
		//PlaceRequest request = new PlaceRequest(NameTokens.display);
		PlaceRequest request = new PlaceRequest(NameTokens.assignleave);
		
		placeManager.revealPlace(request);

	}

	protected void onReset() {

		super.onReset();

	}

}
