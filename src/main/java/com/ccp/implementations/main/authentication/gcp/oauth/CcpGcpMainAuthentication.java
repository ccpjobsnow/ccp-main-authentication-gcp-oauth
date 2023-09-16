package com.ccp.implementations.main.authentication.gcp.oauth;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpGcpMainAuthentication implements CcpInstanceProvider {

	public Object getInstance() {
		return new GcpOauthAuthenticationProvider();
	}

}
