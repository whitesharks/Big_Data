package com.jp.tic.business.device.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.tic.business.device.dao.BayonetManagerDao;
import com.jp.tic.business.device.mapper.BayonetManagerMapper;
import com.jp.tic.business.device.service.BayonetManagerService;
import com.jp.tic.utils.lang.StringUtil;

@Service
public class BayonetManagerServiceImpl implements BayonetManagerService {
	
	@Autowired
	BayonetManagerMapper mapper;
	
	@Autowired
	BayonetManagerDao bayonetManagerDao;
	
	/**
	 * 分页查询设备卡口基本信息
	 * @param param 查询参数
	 * @return 查询结果
	 */
	public List<Map<String, String>> queryBayonetInfoByPage(Map<String, String> param) {
		return mapper.queryBayonetInfoByPage(param);
	}
	
	/**
	 * 统计设备卡口基本信息
	 * @param param 查询参数
	 * @return 查询结果
	 */
	public List<Map<String, String>> countBayonetInfoDatas(Map<String, String> param) {
		return mapper.countBayonetInfoDatas(param);
	}

	/**
	 * 添加设备卡口基本信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int addBayonetInfo(Map<String, String> param) {
		return mapper.addBayonetInfo(param);
	}
	
	/**
	 * 添加待修改的设备卡口基本信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int addBayonetEditInfo(Map<String, String> param) {
		return mapper.addBayonetEditInfo(param);
	}
	
	/**
	 * 删除设备卡口基本信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int deleteBayonetInfo(Map<String, String> param) {
		/*String[] KKBHS = param.get("KKBHS").split(",");
		String idStr = "";
		for (int i = 0; i < KKBHS.length; i++) {
			if (StringUtil.checkStr(idStr)) {
				idStr += ",";
			}
			idStr += "'" + KKBHS[i] + "'";
		}
		param.put("KKBHS", idStr);*/
		
		/*int i = mapper.deleteBayonetInfo(param);
		i += mapper.deleteTimeStatusInfo(param);*/
		
		int i = mapper.deleteTimeStatusInfo(param);
		
		return i;
	}
	
	/**
	 * 更新设备卡口基本信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int updateBayonetInfo(Map<String, String> param) {
		return mapper.updateBayonetInfo(param);
	}
	
	/**
	 * 修改设备卡口基本信息数据，加载要修改的数据信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public List<Map<String, String>> initBayonetDetailInfo(Map<String, String> param) {
		return mapper.initBayonetDetailInfo(param);
	}
	
	/**
	 * 检查是否已经存在此卡点信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public List<Map<String, String>> checkBayonetInfo(Map<String, String> param) {
		return mapper.checkBayonetInfo(param);
	}
	
	/**
	 * 分页查询设备卡口审核信息
	 * @param param 查询参数
	 * @return 查询结果
	 */
	public List<Map<String, String>> queryBayonetVerifyInfo(Map<String, String> param) {
		return bayonetManagerDao.queryBayonetVerifyInfo(param);
	}
	
	/**
	 * 统计卡口审核数量
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public List<Map<String, String>> countBayonetVerifyInfo(Map<String, String> param) {
		return bayonetManagerDao.countBayonetVerifyInfo(param);
	}
	
	/**
	 * 卡口审核的详细信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public List<Map<String, String>> initBayoneVerifyDetail(Map<String, String> param) {
		return bayonetManagerDao.initBayoneVerifyDetail(param);
	}
	
	/**
	 * 审核卡口信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int updateBayoneVerifyInfo(Map<String, String> param) {
		return bayonetManagerDao.updateBayoneVerifyInfo(param);
	}
	
	/**
	 * 首页查询卡口基本信息数据的详细信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public List<Map<String, String>> searchBayonetDetailInfo(Map<String, String> param) {
		return bayonetManagerDao.searchBayonetDetailInfo(param);
	}
	
	/**
	 * 处理待修改的卡口信息数据
	 * @param param 参数
	 */
	public void dealwithEditBayonet(Map<String, String> param) {
		bayonetManagerDao.dealwithEditBayonet(param);
	}
	
	/**
	 * 更新设备卡口基本信息
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int goUpdateBayonetInfo(Map<String, String> param) {
		return mapper.goUpdateBayonetInfo(param);
	}
	
	/**
	 * 对新增的卡口审核时候做处理
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int verifyUpdateAddBayonenet(Map<String, String> param) {
		return bayonetManagerDao.verifyUpdateAddBayonenet(param);
	}
	
	/**
	 * 对修改的卡口审核时候做处理
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int verifyUpdateEditBayonenet(Map<String, String> param) {
		return bayonetManagerDao.verifyUpdateEditBayonenet(param);
	}
	
	/**
	 * 对删除的卡口审核时候做处理
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int verifyUpdateDeleteBayonenet(Map<String, String> param) {
		return bayonetManagerDao.verifyUpdateDeleteBayonenet(param);
	}
	
	/**
	 * 删除卡口准备状态，数据先迁移
	 * @param param 查询参数
	 * @return 返回结果
	 */
	public int addBayonetDeleteInfo(Map<String, String> param) {
		return bayonetManagerDao.addBayonetDeleteInfo(param);
	}

	@Override
	public List<Map<String, String>> loadAllMountInfos() {
		return bayonetManagerDao.loadAllMountInfos();
	}
	
	/**
	 * 加载所有的虚拟卡口信息,
	 * 重写该方法，加入缓存控制
	 * @return 查询结果
	 */
	public List<Map<String, String>> loadAllVirtualMountInfos(String flag) {
		return bayonetManagerDao.loadAllVirtualMountInfos(flag);
	}
	
	/**
	 * 加载所有的虚拟卡口信息,
	 * 重写该方法，加入缓存控制
	 * @return 查询结果
	 */
	public String loadAllVirtualDeptInfos() {
		return bayonetManagerDao.loadAllVirtualDeptInfos();
	}
	
	/**
	 * 加载所有的实体卡口信息,
	 * 重写该方法，加入缓存控制
	 * @return 查询结果
	 */
	public String loadAllDeptMountsInfos() {
		return bayonetManagerDao.loadAllDeptMountsInfos();
	}
}
