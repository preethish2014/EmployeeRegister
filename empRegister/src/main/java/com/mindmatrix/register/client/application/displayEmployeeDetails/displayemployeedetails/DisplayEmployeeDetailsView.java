package com.mindmatrix.register.client.application.displayEmployeeDetails.displayemployeedetails;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class DisplayEmployeeDetailsView extends ViewImpl implements
		DisplayEmployeeDetailsPresenter.MyView {
	interface Binder extends UiBinder<Widget, DisplayEmployeeDetailsView> {
	}

	@UiField
	HTMLPanel main;
	
/*	@UiField
	FlexTable  viewTable;*/
	
	@UiField
	ListBox leaveList;
	
	@UiField
	ListBox assignedLeaveList;

	@Inject
	DisplayEmployeeDetailsView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == DisplayEmployeeDetailsPresenter.SLOT_DisplayEmployeeDetails) {
			//main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
