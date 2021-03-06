package com.globalcollect.gateway.sdk.client.android.sdk.model.paymentproduct.specificdata;

import java.io.Serializable;
import java.util.List;

/**
 * Pojo which holds the payment product 863 specific properties
 * This class is filled by deserialising a JSON string from the GC gateway
 *
 * Copyright 2018 Global Collect Services B.V
 *
 */
public class PaymentProduct863SpecificData implements Serializable {

	private static final long serialVersionUID = -3455606815519003280L;

	private List<String> integrationTypes;


	public List<String> getIntegrationTypes() {
		return integrationTypes;
	}
}
