package com.dao;

import com.entity.ShiyanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanyuyueVO;
import com.entity.view.ShiyanyuyueView;


/**
 * 实验预约
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface ShiyanyuyueDao extends BaseMapper<ShiyanyuyueEntity> {
	
	List<ShiyanyuyueVO> selectListVO(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
	
	ShiyanyuyueVO selectVO(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
	
	List<ShiyanyuyueView> selectListView(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);

	List<ShiyanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
	
	ShiyanyuyueView selectView(@Param("ew") Wrapper<ShiyanyuyueEntity> wrapper);
	
}
