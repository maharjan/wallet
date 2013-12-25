package com.pj.wallet.client.presenter;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.RootPresenter;

public class MyRootpresenter extends RootPresenter {

	@Inject
	public MyRootpresenter(EventBus eventBus, MyRootView view) {
		super(eventBus, view);
	}

	public static final class MyRootView extends RootView {
//		@Override
		public void setInSlot(Object slot, Widget content) {
			RootPanel.get("gwt").add(content);
		}
	}
}
