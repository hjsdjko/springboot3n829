package com.dao;

import com.entity.ShiyanpingfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanpingfenVO;
import com.entity.view.ShiyanpingfenView;


/**
 * 实验评分
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanpingfenDao extends BaseMapper<ShiyanpingfenEntity> {
	
	List<ShiyanpingfenVO> selectListVO(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	
	ShiyanpingfenVO selectVO(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	
	List<ShiyanpingfenView> selectListView(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);

	List<ShiyanpingfenView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	
	ShiyanpingfenView selectView(@Param("ew") Wrapper<ShiyanpingfenEntity> wrapper);
	
}
