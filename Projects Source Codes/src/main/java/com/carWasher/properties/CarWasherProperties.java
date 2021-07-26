package com.carWasher.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

// coge esta clase y en aplication properties se coge como  propiedad y accede a ella progresivamente
@ConfigurationProperties(prefix = "carWasher")
public class CarWasherProperties {

	private Management management = new Management();

	public class Management {
		private boolean loadTestData;

		public boolean isLoadTestData() {
			return loadTestData;
		}

		public void setLoadTestData(boolean loadTestData) {
			this.loadTestData = loadTestData;
		}
	}

	public Management getManagement() {
		return management;
	}

	public void setManagement(Management management) {
		this.management = management;
	}
}
