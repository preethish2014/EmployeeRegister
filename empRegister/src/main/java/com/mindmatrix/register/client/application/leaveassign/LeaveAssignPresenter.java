package com.mindmatrix.register.client.application.leaveassign;

import com.google.gwt.event.shared.GwtEvent.Type;
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

public class LeaveAssignPresenter extends
		Presenter<LeaveAssignPresenter.MyView, LeaveAssignPresenter.MyProxy> {
	interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_LeaveAssign = new Type<RevealContentHandler<?>>();

	@NameToken(NameTokens.assignleave)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<LeaveAssignPresenter> {
	}

	@Inject
	public LeaveAssignPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, RevealType.Root);

	}

	protected void onReset() {					
		super.onReset();
	}

}
