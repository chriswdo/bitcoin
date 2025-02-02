package com.eshore.datasupport.metadata.dao;
import java.util.List;
import java.util.Map;

import com.eshore.datasupport.common.vo.YsjzdVo;
import com.eshore.datasupport.metadata.pojo.Jcmxdy;
import com.eshore.datasupport.metadata.vo.RequestParams;
import com.eshore.khala.common.model.PageConfig;
import com.eshore.khala.core.data.api.dao.IBaseDao;




/**
*generated by tools 
*
*/
public interface IMxdyDao extends IBaseDao<Jcmxdy> {
	/**
	 * 查询决策模型定义表，返回list集合数据
	 * @param zt 主题ID
	 * @param meg 模型名称
	 * @param pc  分页
	 * @return list
	 */
	List<Jcmxdy> getmxdyMessagedata(String zt,String meg,PageConfig pc);
	/**
	 * 得到主题list
	 * @return
	 */
	List<Map<String, Object>> getZhutidata();
	/**
	 * 通过ID查询决策模型表
	 * @param idd
	 * @return
	 */
	//List<Map<String, Object>> getjcmxmessageDataByid(String idd);
	/**
	 * 通过ID查询信息字段表
	 * @param megid  模型表ID
	 * @return
	 */
	List<Map<String, Object>> getjcmxmetadata(String megid);
	/**
	 *  通过ID查询决策模型表,封装成pojo类
	 * @param megid
	 * @return
	 */
	 List<YsjzdVo> getmxdymetadataForcompare(String megid) ;
	 /**
	  * 得到模型定义数据通过ID和字段名称
	  * @param megid
	  * @param mc
	  * @return
	  */
	List<YsjzdVo> getmxdymetadataBymc(String megid, String mc);
	List<Map<String, Object>> getIDfromxxfl(String xxbm);
	List<Jcmxdy> getDataBybm(String xxbm);
	/**
	 * 添加数据到模型定义表
	 * @param params
	 * @param ti
	 * @param cjr
	 * @param gxr
	 */
	void addxxflMeg(RequestParams  params,String ti,String cjr,String gxr);
	/**
	 * 更新决策模型表
	 * @param xxzt
	 * @param xxmc
	 * @param xxms
	 * @param xxid
	 * @param userid
	 * @param ti
	 */
	void  updateMegdata(String xxzt,String xxmc,String xxms,String xxid,String userid,String ti);
	/**
	 * 通过jdbc连接数据库，执行sql语句
	 * @param url  jdbc连接地址
	 * @param driveclass jdbc驱动
	 * @param sqls  执行sql 
	 * @param username jdbc连接用户名
	 * @param password  jdbc连接密码
	 * @return
	 */
	String editxxmetadata(String url,String driveclass,List<String> sqls,String username,String password);


}
