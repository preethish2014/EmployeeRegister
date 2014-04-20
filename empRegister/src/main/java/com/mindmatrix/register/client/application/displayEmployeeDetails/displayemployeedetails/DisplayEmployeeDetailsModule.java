package com.mindmatrix.register.client.application.displayEmployeeDetails.displayemployeedetails;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.mindmatrix.register.client.application.leaveassign.LeaveAssignModule;

public class DisplayEmployeeDetailsModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		install(new LeaveAssignModule());
		bindPresenter(DisplayEmployeeDetailsPresenter.class,
				DisplayEmployeeDetailsPresenter.MyView.class,
				DisplayEmployeeDetailsView.class,
				DisplayEmployeeDetailsPresenter.MyProxy.class);
	}
}
