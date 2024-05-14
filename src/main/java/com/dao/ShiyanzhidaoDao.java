package com.dao;

import com.entity.ShiyanzhidaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanzhidaoVO;
import com.entity.view.ShiyanzhidaoView;


/**
 * 实验指导
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanzhidaoDao extends BaseMapper<ShiyanzhidaoEntity> {
	
	List<ShiyanzhidaoVO> selectListVO(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
	
	ShiyanzhidaoVO selectVO(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
	
	List<ShiyanzhidaoView> selectListView(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);

	List<ShiyanzhidaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
	
	ShiyanzhidaoView selectView(@Param("ew") Wrapper<ShiyanzhidaoEntity> wrapper);
	
}
