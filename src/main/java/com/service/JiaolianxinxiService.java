package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaolianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaolianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaolianxinxiView;


/**
 * 教练信息
 *
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface JiaolianxinxiService extends IService<JiaolianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaolianxinxiVO> selectListVO(Wrapper<JiaolianxinxiEntity> wrapper);
   	
   	JiaolianxinxiVO selectVO(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
   	
   	List<JiaolianxinxiView> selectListView(Wrapper<JiaolianxinxiEntity> wrapper);
   	
   	JiaolianxinxiView selectView(@Param("ew") Wrapper<JiaolianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaolianxinxiEntity> wrapper);
   	

}

