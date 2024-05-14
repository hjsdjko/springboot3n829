package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanxinxiView;


/**
 * 实验信息
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanxinxiService extends IService<ShiyanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanxinxiVO> selectListVO(Wrapper<ShiyanxinxiEntity> wrapper);
   	
   	ShiyanxinxiVO selectVO(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
   	
   	List<ShiyanxinxiView> selectListView(Wrapper<ShiyanxinxiEntity> wrapper);
   	
   	ShiyanxinxiView selectView(@Param("ew") Wrapper<ShiyanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanxinxiEntity> wrapper);
   	
}

