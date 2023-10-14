package com.ccp.implementations.main.authentication.gcp.oauth;

import java.io.InputStream;
import java.util.Collections;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
	
import com.ccp.decorators.CcpStringDecorator;
import com.ccp.especifications.main.authentication.CcpAuthenticationProvider;

public class GcpOauthAuthenticationProvider implements CcpAuthenticationProvider{

	@Override
	public String getJwtToken() {
		try {
			InputStream file = new CcpStringDecorator("credentials.json").inputStreamFrom().fromEnvironmentVariablesOrClassLoaderOrFile();
			GoogleCredential credential = GoogleCredential.fromStream(file)
					.createScoped(Collections.singleton("https://www.googleapis.com/auth/cloud-platform"));
			credential.refreshToken();
			String accessToken = credential.getAccessToken();
			return accessToken;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
