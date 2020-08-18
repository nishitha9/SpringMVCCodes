package web.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class ControllerDemo extends AbstractController {
	
	public ModelAndView handleRequestInternal(HttpServletRequest request ,HttpServletResponse response)
	{
		
		ModelAndView mv=new ModelAndView("display.jsp");
		mv.addObject("greet","HelloWorld");
		return mv;
	}

}
