package com.qingmu.xiaoshuchong.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingmu.xiaoshuchong.bean.Category;
import com.qingmu.xiaoshuchong.dao.CategoryDao;

@RestController
@SpringBootApplication
public class CategoryController {
	@Inject
	private CategoryDao dao;

	@RequestMapping("/category/getCategoryList")
	public List<Category> getCategoryList() {
		return dao.getCategoryList();
	}
}
