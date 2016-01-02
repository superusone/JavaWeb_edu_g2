package cn.zjxu.exam.paper.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowPaperServlet extends PaperServlet {
	public void ShowPaper(HttpServletRequest request,
			HttpServletResponse response){
		String papertype = request.getParameter("papertype");
		
	}
}
