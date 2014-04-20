package com.mindmatrix.register.client.application.employeeregister.mainmenu.testpresenter;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
//import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.mindmatrix.register.client.place.NameTokens;

public class testPresenterPresenter
		extends
		Presenter<testPresenterPresenter.MyView, testPresenterPresenter.MyProxy>
		implements testPresenterUiHandlers {
	interface MyView extends View, HasUiHandlers<testPresenterUiHandlers> {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_testPresenter = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.test)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<testPresenterPresenter> {
	}

	@Inject
	public testPresenterPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

		getView().setUiHandlers(this);
	}

	protected void onBind() {
		super.onBind();
	}


	
	protected void onReset() {
		super.onReset();
	}

}
