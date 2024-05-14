package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanyuyueView;


/**
 * 实验预约
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanyuyueService extends IService<ShiyanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanyuyueVO> selectListVO(Wrapper<ShiyanyuyueEntity> wrapper);
   	
   	ShiyanyuyueVO selectVO(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
   	
   	List<ShiyanyuyueView> selectListView(Wrapper<ShiyanyuyueEntity> wrapper);
   	
   	ShiyanyuyueView selectView(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanyuyueEntity> wrapper);
   	
}

