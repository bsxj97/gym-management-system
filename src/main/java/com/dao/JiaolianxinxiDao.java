package com.dao;

import com.entity.JiaolianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaolianxinxiVO;
import com.entity.view.JiaolianxinxiView;


/**
 * 教练信息
 * 
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface JiaolianxinxiDao extends BaseMapper<JiaolianxinxiEntity> {
	
	List<JiaolianxinxiVO> selectListVO(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
	
	JiaolianxinxiVO selectVO(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
	
	List<JiaolianxinxiView> selectListView(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);

	List<JiaolianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
	
	JiaolianxinxiView selectView(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
	

}
