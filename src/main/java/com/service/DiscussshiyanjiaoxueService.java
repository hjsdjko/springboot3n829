package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiyanjiaoxueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiyanjiaoxueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiyanjiaoxueView;


/**
 * 实验教学评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface DiscussshiyanjiaoxueService extends IService<DiscussshiyanjiaoxueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiyanjiaoxueVO> selectListVO(Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
   	
   	DiscussshiyanjiaoxueVO selectVO(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
   	
   	List<DiscussshiyanjiaoxueView> selectListView(Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
   	
   	DiscussshiyanjiaoxueView selectView(@Param("ew") Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiyanjiaoxueEntity> wrapper);
   	
}

