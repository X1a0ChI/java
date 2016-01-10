package com.x1a0ch1.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File some;
	private String someFileName;
	private String someContentType;
	public static void copy(File src,File dest){
		try{
			FileInputStream fis=new FileInputStream(src);
			FileOutputStream fos=new FileOutputStream(dest);
			byte[] bbs=new byte[1024];
			int size=-1;
			while(-1!=(size=fis.read(bbs))){
				fos.write(bbs,0,size);
			}
			fos.close();
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public String execute(){
		ServletContext application=ServletActionContext.getServletContext();
		String file_dir=application.getRealPath("/");
		String destFile=file_dir+File.separatorChar+someFileName;
		copy(some,new File(destFile));
		return "success";
	}
	public File getSome() {
		return some;
	}
	public void setSome(File some) {
		this.some = some;
	}
	public String getSomeFileName() {
		return someFileName;
	}
	public void setSomeFileName(String someFileName) {
		this.someFileName = someFileName;
	}
	public String getSomeContentType() {
		return someContentType;
	}
	public void setSomeContentType(String someContentType) {
		this.someContentType = someContentType;
	}

}
