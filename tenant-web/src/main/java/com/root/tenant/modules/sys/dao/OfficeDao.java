/**
 * Copyright &copy; 2015-2020 <a href="http://www.wusyx.com/">wusyx</a> All rights reserved.
 */
package com.root.tenant.modules.sys.dao;

import com.root.tenant.common.persistence.TreeDao;
import com.root.tenant.common.persistence.annotation.MyBatisDao;
import com.root.tenant.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author tenant
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
	public Office getByCode(String code);
}