package com.mindmatrix.register.client.application.leaveassign;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class LeaveAssignModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(LeaveAssignPresenter.class,
				LeaveAssignPresenter.MyView.class, LeaveAssignView.class,
				LeaveAssignPresenter.MyProxy.class);
	}
}
