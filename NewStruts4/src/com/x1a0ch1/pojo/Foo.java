package com.x1a0ch1.pojo;

import java.util.List;
import java.util.Map;

public class Foo {
	private int id;
	private String name;
	private String[] arr;
	private List<String> list;
	private Map<String,String> map;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Foo(){
		
	}
	public Foo(String name){
		this.name=name;
	}
}
