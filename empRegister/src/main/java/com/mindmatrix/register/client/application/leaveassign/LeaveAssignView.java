package com.mindmatrix.register.client.application.leaveassign;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class LeaveAssignView extends ViewImpl implements
		LeaveAssignPresenter.MyView {
	interface Binder extends UiBinder<Widget, LeaveAssignView> {
	}

	@UiField
	HTMLPanel main;

	@Inject
	LeaveAssignView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == LeaveAssignPresenter.SLOT_LeaveAssign) {
			//main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
