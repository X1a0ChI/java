package com.x1a0ch1.action;

import java.util.Locale;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectAction extends ActionSupport {
	private String languageSelect;

	public String getLanguageSelect() {
		return languageSelect;
	}

	public void setLanguageSelect(String languageSelect) {
		this.languageSelect = languageSelect;
	}
	public String execute(){
		Locale locale=null;
		if("en_US".equals(languageSelect)){
			locale=Locale.US;
		}else if("zh_CN".equals(languageSelect)){
			locale=Locale.SIMPLIFIED_CHINESE;
		}else if("zh_TW".equals(languageSelect)){
			locale=Locale.TRADITIONAL_CHINESE;
		}
		ActionContext.getContext().setLocale(locale);
		return "success";
	}
	
}
