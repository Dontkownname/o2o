package com.mooc.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mooc.o2o.BaseTest;
import com.mooc.o2o.entity.Area;
import com.mooc.o2o.service.AreaService;

public class AreaServiceTest extends BaseTest{
	  
	@Autowired
	private AreaService areaService;
	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("西苑",areaList.get(0).getAreaName());
	}
}
