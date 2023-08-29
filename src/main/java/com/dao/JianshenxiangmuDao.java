package com.dao;

import com.entity.JianshenxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianshenxiangmuVO;
import com.entity.view.JianshenxiangmuView;


/**
 * 健身项目
 * 
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface JianshenxiangmuDao extends BaseMapper<JianshenxiangmuEntity> {
	
	List<JianshenxiangmuVO> selectListVO(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
	
	JianshenxiangmuVO selectVO(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
	
	List<JianshenxiangmuView> selectListView(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);

	List<JianshenxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
	
	JianshenxiangmuView selectView(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
	

}
