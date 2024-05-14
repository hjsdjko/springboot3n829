package com.dao;

import com.entity.ShiyanjiaoxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanjiaoxueVO;
import com.entity.view.ShiyanjiaoxueView;


/**
 * 实验教学
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanjiaoxueDao extends BaseMapper<ShiyanjiaoxueEntity> {
	
	List<ShiyanjiaoxueVO> selectListVO(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
	
	ShiyanjiaoxueVO selectVO(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
	
	List<ShiyanjiaoxueView> selectListView(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);

	List<ShiyanjiaoxueView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
	
	ShiyanjiaoxueView selectView(@Param("ew") Wrapper<ShiyanjiaoxueEntity> wrapper);
	
}
