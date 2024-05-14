package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanpingfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanpingfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanpingfenView;


/**
 * 实验评分
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanpingfenService extends IService<ShiyanpingfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanpingfenVO> selectListVO(Wrapper<ShiyanpingfenEntity> wrapper);
   	
   	ShiyanpingfenVO selectVO(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
   	
   	List<ShiyanpingfenView> selectListView(Wrapper<ShiyanpingfenEntity> wrapper);
   	
   	ShiyanpingfenView selectView(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanpingfenEntity> wrapper);
   	
}

