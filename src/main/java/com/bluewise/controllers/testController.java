package com.bluewise.controllers;

import com.alibaba.fastjson.JSON;
import com.bluewise.entitys.EmployeesEntity;
import com.bluewise.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created by wangshunchu on 16/3/9.
 */

@Controller
public class testController {

    @Qualifier("employeeService")
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = "test")
    @ResponseBody
    public String mytest() {
        List<EmployeesEntity> emps = (List<EmployeesEntity>) employeeService.findAll();

        return JSON.toJSON(emps).toString();
        //return "testmain";
    }

    @RequestMapping(value = "testlist")
    public String mytest1() {
        List<EmployeesEntity> emps = (List<EmployeesEntity>) employeeService.findAll();
        return "testmain1";
        //return "testmain";
    }

    @RequestMapping(value = "jsp/testJsp")
    public String myJsp() {
        List<EmployeesEntity> emps = (List<EmployeesEntity>) employeeService.findAll();
        return "jsp/test1";
        //return "testmain";
    }


    @RequestMapping(value = "testleaf")
    public String testleaf(Model model) {
        List<EmployeesEntity> emps = (List<EmployeesEntity>) employeeService.findAll();
        String s =  request.getAttributeNames().toString();
        request.setAttribute("emps",emps);
        System.out.println(s);
        s = request.getParameter("id");
        System.out.println(s);
        model.addAttribute("hello1","good");
        model.addAttribute("hello","王顺初");
        model.addAttribute("var1",2);
        model.addAttribute("obj","var data = \"" + JSON.toJSONString(model) + "\"");
//        request.setAttribute("var1",2);
        return "html/testmain";
        //return "testmain";
    }

    @RequestMapping(value = "getimg")
    public void getImage(HttpServletRequest request, HttpServletResponse response)
    {
        FileInputStream fis = null;
        response.setContentType("image/jpeg");
        try {
            OutputStream out = response.getOutputStream();
            File file = new File("/Users/wangshunchu/Pictures/pic.tmp/20130122_135431.jpg");
            fis = new FileInputStream(file);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            out.write(b);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
