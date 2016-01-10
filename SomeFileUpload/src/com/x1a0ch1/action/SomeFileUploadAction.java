package com.x1a0ch1.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SomeFileUploadAction extends ActionSupport {
	private File[] uploadFiles;
	private String[] uploadFilesContentType;
	private String[] uploadFilesName;
	private String savePath;
	public File[] getUploadFiles() {
		return uploadFiles;
	}
	public void setUploadFiles(File[] uploadFiles) {
		this.uploadFiles = uploadFiles;
	}
	public String[] getUploadFilesContentType() {
		return uploadFilesContentType;
	}
	public void setUploadFilesContentType(String[] uploadFilesContentType) {
		this.uploadFilesContentType = uploadFilesContentType;
	}
	public String[] getUploadFilesName() {
		return uploadFilesName;
	}
	public void setUploadFilesName(String[] uploadFilesName) {
		this.uploadFilesName = uploadFilesName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String execute()throws Exception{
		try {
			File[] files=getUploadFiles();
			for(int i=0;i<files.length;i++){
				InputStream is=new FileInputStream(files[i]);
				String uploadPath=ServletActionContext.getServletContext().getRealPath(getSavePath());
				File toFile=new File(uploadPath,getUploadFilesName()[i]);
				OutputStream os=new FileOutputStream(toFile);
				byte[] buffer=new byte[1024];
				int length=0;
				while((length=is.read(buffer))>0){
					os.write(buffer, 0, length);
				}
				is.close();
				os.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}
