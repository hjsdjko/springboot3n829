package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanyuanView;


/**
 * 实验员
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanyuanService extends IService<ShiyanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanyuanVO> selectListVO(Wrapper<ShiyanyuanEntity> wrapper);
   	
   	ShiyanyuanVO selectVO(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
   	
   	List<ShiyanyuanView> selectListView(Wrapper<ShiyanyuanEntity> wrapper);
   	
   	ShiyanyuanView selectView(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanyuanEntity> wrapper);
   	
}

