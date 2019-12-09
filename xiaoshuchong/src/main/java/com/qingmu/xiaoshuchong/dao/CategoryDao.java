package com.qingmu.xiaoshuchong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qingmu.xiaoshuchong.bean.Category;

@Mapper
public interface CategoryDao {
	public List<Category> getCategoryList();
}
