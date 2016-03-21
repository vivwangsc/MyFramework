package com.bluewise.util;

import com.bluewise.util.Const;
import com.bluewise.util.Tools;

import java.util.List;

/**
 * 处理数据分页
 * 考虑一个web请求,它是无状态的
 * 计算请求的hashcode,当然,hashcode去除了page参数,就可以知道参数是否发生变化
 * 如果hashcode没有变化,则只执行处理函数.
 * 一个问题,在分页插件里面怎么处理分页并且填入page<T>这个参数?
 * @param <T>
 */
public class Page <T>{
	
	private int showCount; //每页显示记录数
	private int totalPage;		//总页数
	private int totalResult;	//总记录数
	private int currentPage;	//当前页
	private int currentResult;	//当前记录起始索引
	//为了进行索引优化,所以对于查询条件要保存,如果查询条件没有变化就直接进行查询处理了,不需要重新计算页数
	//在大数据应用里面,数据并不需要那么即时与精确.

	private List<T> data;   //真正的模型数据
	private PageData pd = new PageData();

	public Page(){
		try {
			this.showCount = Integer.parseInt(Tools.readTxtFile(Const.PAGE));
		} catch (Exception e) {
			this.showCount = 15;
		}
	}
	
	public int getTotalPage() {
		if(totalResult%showCount==0)
			totalPage = totalResult/showCount;
		else
			totalPage = totalResult/showCount+1;
		return totalPage;
	}
	
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getTotalResult() {
		return totalResult;
	}
	
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	public int getCurrentPage() {
		if(currentPage<=0)
			currentPage = 1;
		if(currentPage>getTotalPage())
			currentPage = getTotalPage();
		return currentPage;
	}
	
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	

	public int getShowCount() {
		return showCount;
	}
	
	public void setShowCount(int showCount) {
		
		this.showCount = showCount;
	}
	
	public int getCurrentResult() {
		currentResult = (getCurrentPage()-1)*getShowCount();
		if(currentResult<0)
			currentResult = 0;
		return currentResult;
	}
	
	public void setCurrentResult(int currentResult) {
		this.currentResult = currentResult;
	}
	

	public PageData getPd() {
		return pd;
	}

	public void setPd(PageData pd) {
		this.pd = pd;
	}
	
}
