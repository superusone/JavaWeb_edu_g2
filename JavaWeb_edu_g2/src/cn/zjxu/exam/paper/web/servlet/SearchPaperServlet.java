package cn.zjxu.exam.paper.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.commons.CommonUtils;
import cn.zjxu.exam.paper.domain.Form;
import cn.zjxu.exam.paper.service.JudgeAnswerService;
/**
 *判断答案是否正确
 * @author Administrator
 *
 */
public class SearchPaperServlet extends PaperServlet {
	private JudgeAnswerService jas = new JudgeAnswerService();
/**
 * 调用Judge方法判断答案是否正确
 * @param request
 * @param response
 */
	public void JudgeAnswer(HttpServletRequest request,
			HttpServletResponse response) {
		Form form = CommonUtils.toBean(request.getParameterMap(), Form.class);
		jas.Judge(form.getId(), form.getPid1(), form.getPid1_useranswer());
		jas.Judge(form.getId(), form.getPid2(), form.getPid2_useranswer());
		jas.Judge(form.getId(), form.getPid3(), form.getPid3_useranswer());
		jas.Judge(form.getId(), form.getPid4(), form.getPid4_useranswer());
		jas.Judge(form.getId(), form.getPid5(), form.getPid5_useranswer());
		jas.Judge(form.getId(), form.getPid6(), form.getPid6_useranswer());

	}
}