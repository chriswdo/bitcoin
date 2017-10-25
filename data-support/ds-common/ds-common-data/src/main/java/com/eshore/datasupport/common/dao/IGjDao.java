package com.eshore.datasupport.common.dao;

import java.util.List;
import java.util.Map;

import com.eshore.datasupport.common.pojo.Gj;
import com.eshore.khala.common.model.PageConfig;
import com.eshore.khala.core.data.api.dao.IBaseDao;

/**
*generated by tools 
*
*/
public interface IGjDao extends IBaseDao<Gj> {

	/**
	 * 获取告警纪录
	 * @param params 参数
	 * @param pc 分页参数
	 * @return 告警纪录list
	 */
	List<Gj> listxAlarmRecord(Map<String, String> params, PageConfig pc);

	/**
	 * 通过任务id获取gj纪录
	 * @param rwid 任务id
	 * @return 告警纪录list
	 */
	List getGjRecordByRwid(String rwid);

	boolean existGjByRwid(String rwid);

}
