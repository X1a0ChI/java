package com.x1a0ch1.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.x1a0ch1.commodity.Commodity;
import com.x1a0ch1.dao.CommodityDAO;
import com.x1a0ch1.factory.CommodityDAOFactory;
import com.x1a0ch1.page.Page;
import com.x1a0ch1.page.PageUtil;

public class ShowCommodityAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentPage;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String execute() throws Exception{
		CommodityDAO commodityDAO=CommodityDAOFactory.getCommodityDAOInstance();
		List<Commodity> commodityList=commodityDAO.findAllCommodity();
		Page page=PageUtil.createPage(5, commodityList.size(), currentPage);
		int endIndex=page.getBeginIndex()+page.getEveryPage();
		if(page.getBeginIndex()+page.getEveryPage()>page.getTotalCount()){
			endIndex=page.getTotalCount();
		}
		commodityList=commodityList.subList(page.getBeginIndex(), endIndex);
		ServletActionContext.getRequest().setAttribute("commodityList", commodityList);
		ServletActionContext.getRequest().setAttribute("page", page);
		return "success";
	}
}
