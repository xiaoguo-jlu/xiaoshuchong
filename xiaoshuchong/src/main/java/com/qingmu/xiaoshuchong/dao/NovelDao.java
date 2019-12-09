package com.qingmu.xiaoshuchong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.qingmu.xiaoshuchong.bean.Chapter;
import com.qingmu.xiaoshuchong.bean.Novel;

@Mapper
public interface NovelDao {
	public Novel getNovel(String id);
	public List<Novel> getNovelList();
	public List<Chapter> getChapterList(String id);
}
