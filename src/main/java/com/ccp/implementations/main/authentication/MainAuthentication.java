package com.ccp.implementations.main.authentication;

import com.ccp.dependency.injection.CcpModuleExporter;

public class MainAuthentication implements CcpModuleExporter {

	public Object export() {
		return new GcpOauthAuthenticationProvider();
	}

}
