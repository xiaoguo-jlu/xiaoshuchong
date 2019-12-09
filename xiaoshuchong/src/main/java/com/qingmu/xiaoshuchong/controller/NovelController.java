package com.qingmu.xiaoshuchong.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingmu.xiaoshuchong.bean.Chapter;
import com.qingmu.xiaoshuchong.bean.Novel;
import com.qingmu.xiaoshuchong.dao.NovelDao;

@RestController
@SpringBootApplication
public class NovelController {
	
	@Inject
	private NovelDao dao;
	
	@GET
	@RequestMapping("/novel/getNovel/{novelId}")
	public Novel getNovel(@PathVariable(value = "novelId") String id) {
		return dao.getNovel(id);
	}
	
	@RequestMapping("/novel/getNovelList")
	public List<Novel> getNovelList() {
		return dao.getNovelList();
	}
	
	@RequestMapping("/novel/getChapterList/{novelId}")
	public List<Chapter> getChapterList(@PathVariable("novelId") String id){
		return dao.getChapterList(id);
	}

}
