package com.dao;

import com.entity.DiscussshiyanjiaoxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshiyanjiaoxueVO;
import com.entity.view.DiscussshiyanjiaoxueView;


/**
 * 实验教学评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface DiscussshiyanjiaoxueDao extends BaseMapper<DiscussshiyanjiaoxueEntity> {
	
	List<DiscussshiyanjiaoxueVO> selectListVO(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
	
	DiscussshiyanjiaoxueVO selectVO(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
	
	List<DiscussshiyanjiaoxueView> selectListView(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);

	List<DiscussshiyanjiaoxueView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
	
	DiscussshiyanjiaoxueView selectView(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
	
}
