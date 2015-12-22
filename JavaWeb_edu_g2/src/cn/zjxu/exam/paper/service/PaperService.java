package cn.zjxu.exam.paper.service;

import java.util.List;

import cn.zjxu.exam.paper.dao.PaperDao;
import cn.zjxu.exam.paper.domain.Paper;

public class PaperService {
	private PaperDao paperDao = new PaperDao();
	
	/**
	 * 试题集
	 * @return
	 */
	public List<Paper> findAll(){
		List list = paperDao.findAll();
		return list;
		
	}
}
