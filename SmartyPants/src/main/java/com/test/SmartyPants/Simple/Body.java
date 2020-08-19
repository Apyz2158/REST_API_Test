package com.test.SmartyPants.Simple;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Body {
	
	private String companyId;
	private List<SlotList> slotsList;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public List<SlotList> getSlotsList() {
		return slotsList;
	}

	public void setSlotsList(List<SlotList> slotsList) {
		this.slotsList = slotsList;
	}
}
