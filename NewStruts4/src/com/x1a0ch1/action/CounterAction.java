package com.x1a0ch1.action;

import com.opensymphony.xwork2.ActionSupport;

public class CounterAction extends ActionSupport {
	private double num1;
	private double num2;
	private double sum;
	private String operation;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String execute(){
		if("add".equals(operation)){
			sum=num1+num2;
		}else if("minus".equals(operation)){
			sum=num1-num2;
		}else if("multiply".equals(operation)){
			sum=num1*num2;
		}else{
			sum=num1/num2;
		}
		return "success";
	}
}
