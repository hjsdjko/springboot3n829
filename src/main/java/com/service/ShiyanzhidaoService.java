package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanzhidaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanzhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanzhidaoView;


/**
 * 实验指导
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanzhidaoService extends IService<ShiyanzhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanzhidaoVO> selectListVO(Wrapper<ShiyanzhidaoEntity> wrapper);
   	
   	ShiyanzhidaoVO selectVO(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
   	
   	List<ShiyanzhidaoView> selectListView(Wrapper<ShiyanzhidaoEntity> wrapper);
   	
   	ShiyanzhidaoView selectView(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanzhidaoEntity> wrapper);
   	
}

