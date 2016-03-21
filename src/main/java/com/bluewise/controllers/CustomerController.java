/**
 * 测试fordatajpa
 */
package com.bluewise.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.bluewise.entitys.Customer;
import com.bluewise.entitys.easyui.DataGrid;
import com.bluewise.entitys.easyui.Json;
import com.bluewise.entitys.easyui.PageHelper;
import com.bluewise.services.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zh
 */
@Controller
public class CustomerController {
	
	private final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Resource
	private CustomerService customerService;
	
	/**
	 * 跳转到客户表格页面
	 * @return
	 */
	@RequestMapping(value = "/customer/list",method = RequestMethod.GET)
    public String customerList(Model model) {
        return "crm/customer_list";
    }
	
	/**
	 * 表格
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/customer/datagrid", method = RequestMethod.POST)
	public DataGrid datagrid(PageHelper page, Customer customer) {
		DataGrid dg = new DataGrid();
		//dg.setTotal(customerService.count());
        //获取列表
        PageRequest pageRequest = new PageRequest(page.getPage(),page.getRows());
        Page<Customer> pg =  customerService.findAll(pageRequest);
        dg.setTotal(pg.getTotalElements());
        dg.setRows(pg.getContent());
		return dg;
	}
	
	/**
	 * 新增
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/customer/add",method = RequestMethod.POST)
    public Json add(Customer customer) {
		Json j = new Json();
		
		try {
			customerService.save(customer);
            j.setSuccess(true);
            j.setMsg("用户新增成功！");
            j.setObj(customer);
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
    }
	
	/**
     * 修改
     * 
     * @return
     */
	@ResponseBody
    @RequestMapping(value = "/customer/edit",method = RequestMethod.POST)
    public Json editUser(Customer customer) {
        Json j = new Json();
        log.debug("穿过来的用户ID为："+customer.getId());
        try {
            //good,testfor
        	customerService.save(customer);
            j.setSuccess(true);
            j.setMsg("编辑成功！");
            j.setObj(customer);
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
    }
	
	/**
	 * 删除某个
	 * @param
	 */
	@ResponseBody
	@RequestMapping(value = "/customer/delete",method = RequestMethod.POST)
	public Json delete(Customer customer) {
		Json j = new Json();
        log.debug("穿过来的用户ID为："+customer.getId());
        try {
        	customerService.delete(customer);
			j.setSuccess(true);
	        j.setMsg("删除成功！");
        } catch (Exception e) {
            j.setMsg(e.getMessage());
        }
        return j;
	}
}
