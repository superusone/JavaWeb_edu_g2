package cn.zjxu.exam.paper.web.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zjxu.exam.paper.service.ShowPaperService;


public class ShowPaperServlet extends PaperServlet {
	private ShowPaperService sps = new ShowPaperService();
	
	public void ShowPaper(HttpServletRequest request,
			HttpServletResponse response){
		String papertype = request.getParameter("papertype");
		List paperTypedList = sps.findByNote(papertype);
	}
}
