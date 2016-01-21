package com.globalcollect.gateway.sdk.client.android.exampleapp.render.iinlookup;


/**
 * Defines the rendering of IIN lookup response interface methods
 * Copyright 2014 Global Collect Services B.V
 *
 */
public interface RenderIinLookupInterface extends OnIinLookupCompleteListener {
	
	
	@Override
	public void onIinLookupComplete(IinDetailsResponse iinResponse);
	
}