package com.dao;

import com.entity.ShiyanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanyuanVO;
import com.entity.view.ShiyanyuanView;


/**
 * 实验员
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanyuanDao extends BaseMapper<ShiyanyuanEntity> {
	
	List<ShiyanyuanVO> selectListVO(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
	
	ShiyanyuanVO selectVO(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
	
	List<ShiyanyuanView> selectListView(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);

	List<ShiyanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
	
	ShiyanyuanView selectView(@Param("ew") Wrapper<ShiyanyuanEntity> wrapper);
	
}
