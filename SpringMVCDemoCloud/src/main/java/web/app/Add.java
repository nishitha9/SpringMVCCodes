package web.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //can also use class and interface to create controller
//@RequestMapping("/Calculator")
public class Add {
	
	@RequestMapping("/")
	public void addition(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		int number1=Integer.parseInt(request.getParameter("no1"));
		int number2=Integer.parseInt(request.getParameter("no2"));
		PrintWriter out=response.getWriter();
		int res=number1+number2;
		out.println("The sum is: "+res);
	}

	@RequestMapping("/Sub")
	public void subraction(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		int number1=Integer.parseInt(request.getParameter("no1"));
		int number2=Integer.parseInt(request.getParameter("no2"));
		PrintWriter out=response.getWriter();
		int res=number1-number2;
		out.println("The Difference is: "+Math.abs(res));
	}
	@RequestMapping("/login")
	public Map<String, Integer> login(@RequestParam int no1, @RequestParam int no2,Map<String,Integer> map)
	{
		
		map.put("number1", no1);
		map.put("number2",no2);
		//ModelAndView modelView=new ModelAndView("display.jsp");
		//modelView.addObject("number",no1);
		
		ModelAndView mv=new ModelAndView("redirect:/logout");
		
		return map;
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String password,ModelAndView mv)
	{
		if(!password.equals("password"))
			return new ModelAndView("redirect:/login.jsp");
		return mv;
	}
	
}
