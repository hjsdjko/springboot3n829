package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanjiaoxueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanjiaoxueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanjiaoxueView;


/**
 * 实验教学
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanjiaoxueService extends IService<ShiyanjiaoxueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanjiaoxueVO> selectListVO(Wrapper<ShiyanjiaoxueEntity> wrapper);
   	
   	ShiyanjiaoxueVO selectVO(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
   	
   	List<ShiyanjiaoxueView> selectListView(Wrapper<ShiyanjiaoxueEntity> wrapper);
   	
   	ShiyanjiaoxueView selectView(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanjiaoxueEntity> wrapper);
   	
}

