package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.app.model.Token;

@Component
@Scope("singleton")
public class TokenService 
{
	@Autowired
	private Token token;

	public Token getToken() {
		token = getNewToken();
		return token;
		
	}
	
	@Lookup
	public Token getNewToken() {
		return null;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	
}
