package com.ljwd.plms.mapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象控制层
 * @author tangjialin on 2016-10-27 0027.
 */
public abstract class MAppAbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
	protected boolean isInfoEnabled = logger.isInfoEnabled();

}