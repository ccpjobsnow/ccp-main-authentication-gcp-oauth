package com.ccp.implementations.main.authentication;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpGcpMainAuthentication implements CcpInstanceProvider {

	public Object getInstance() {
		return new GcpOauthAuthenticationProvider();
	}

}
