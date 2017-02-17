package com.ljwd.plms.cache;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.ljwd.plms.test.TestSupport;
import com.ljwd.plms.web.model.type.LAccwaterType;
import com.ljwd.plms.web.model.type.LAccwaterTypeExample;
import com.ljwd.plms.web.service.type.inf.LAccwaterTypeService;

public class TestCache extends TestSupport{
	@Resource
	private LAccwaterTypeService lAccwaterTypeService;

	@Test
	public void test01() throws InterruptedException {
		LAccwaterTypeExample la =new LAccwaterTypeExample();
		List<LAccwaterType> list = lAccwaterTypeService.selectByExample(la);
		System.out.println(list.size());
		Thread.sleep(2000);
		lAccwaterTypeService.selectByExample(la);
		System.out.println(list.size());
		Thread.sleep(2000);
		lAccwaterTypeService.selectByExample(la);
		System.out.println(list.size());
	}

}
