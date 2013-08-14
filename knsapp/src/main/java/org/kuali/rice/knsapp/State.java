package org.kuali.rice.knsapp;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class State extends PersistableBusinessObjectBase {
    private static final long serialVersionUID = 6097498602725305353L;

    private String code;
    private String name;
    private String countryCode;
    private boolean active;
    
    private Country country;
    
   
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

}
