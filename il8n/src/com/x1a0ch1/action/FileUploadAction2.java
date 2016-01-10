package com.x1a0ch1.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction2 extends ActionSupport {
	private String savaPath;
	private File uploadFile;
	private String uploadFileContentType;
	private String uploadFileFileName;
	public String getSavaPath() {
		return savaPath;
	}
	public void setSavaPath(String savaPath) {
		this.savaPath = savaPath;
	}
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
	public String execute() throws Exception{
		InputStream is=new FileInputStream(uploadFile);
		String uploadPath=ServletActionContext.getServletContext().getRealPath("savePath"); //�����ϴ��ļ�Ŀ¼
		File toFile=new File(uploadPath,this.getUploadFileFileName());//����Ŀ���ļ�
		OutputStream os=new FileOutputStream(toFile);//����һ�������
		byte[] buffer=new byte[1024];//���û���
		int length=0;
		while((length=is.read(buffer))>0){
			os.write(buffer,0,length);
		}
		is.close();
		os.close();
		return "success";
	}
}
