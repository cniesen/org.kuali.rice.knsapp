package org.kuali.rice.knsapp;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class Country extends PersistableBusinessObjectBase {
	private static final long serialVersionUID = 5997177544946633507L;

	private String code;
	private String alternateCode;
	private String name;
	private boolean restricted;
	private boolean active;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAlternateCode() {
		return alternateCode;
	}
	public void setAlternateCode(String alternateCode) {
		this.alternateCode = alternateCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRestricted() {
		return restricted;
	}
	public void setRestricted(boolean restricted) {
		this.restricted = restricted;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}