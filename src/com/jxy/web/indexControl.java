package com.jxy.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jxy.bean.user;

@Controller
public class indexControl {
	@RequestMapping("index")
	public String handle1(HttpServletRequest request){
//		System.out.println(request.getParameter("username"));
		System.out.println("I'm comming");
		return "index";
	}
	/**
	 * 
	 *返回值类型：void<br /> 
	 *功能：通过json格式化工具，将对象那个转换成json数据<br />
	 *作者：JXY<br />
	 *日期：2016年9月11日<br />
	 *@param response
	 *@throws JSONException
	 *@throws IOException<br />
	 */
//	@ResponseBody
	@RequestMapping("handle2")
	public void  handel2(HttpServletResponse response) throws JSONException, IOException{
		user us=new user();
		us.setUsername("金显昱");
		us.setPassword("12344321");
		us.setAge(23);
		response.setContentType("application/json;charset=utf-8");
		PrintWriter print=response.getWriter();
		print.write(JSONUtil.serialize(us));
		print.flush();
		print.close();
	}
	
	@RequestMapping(value="handle3")
	public String handle3(HttpServletRequest request,HttpServletResponse response){
		System.out.println("hello, I'm handle3 ");
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		return "acceptdata";
	}
}
