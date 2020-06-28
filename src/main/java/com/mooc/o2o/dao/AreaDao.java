package com.mooc.o2o.dao;

import java.util.List;

import com.mooc.o2o.entity.Area;

public interface AreaDao {
	
	
	/**
	 * 查询区域列表
	 * 
	 * @return areaList
	 */
	List<Area> queryArea();
 }
