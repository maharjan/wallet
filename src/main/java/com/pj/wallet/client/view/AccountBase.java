package com.pj.wallet.client.view;

import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.TabView;
import com.gwtplatform.mvp.client.UiHandlers;

public interface AccountBase extends TabView, HasUiHandlers<AccountBase.AccountBaseViewUiHandlers> {

	public interface AccountBaseViewUiHandlers extends UiHandlers {

	}
}
