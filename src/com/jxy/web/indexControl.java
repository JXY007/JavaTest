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
	 *����ֵ���ͣ�void<br /> 
	 *���ܣ�ͨ��json��ʽ�����ߣ��������Ǹ�ת����json����<br />
	 *���ߣ�JXY<br />
	 *���ڣ�2016��9��11��<br />
	 *@param response
	 *@throws JSONException
	 *@throws IOException<br />
	 */
//	@ResponseBody
	@RequestMapping("handle2")
	public void  handel2(HttpServletResponse response) throws JSONException, IOException{
		user us=new user();
		us.setUsername("������");
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
