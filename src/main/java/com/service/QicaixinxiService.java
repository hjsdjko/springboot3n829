package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicaixinxiView;


/**
 * 器材信息
 *
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public interface QicaixinxiService extends IService<QicaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicaixinxiVO> selectListVO(Wrapper<QicaixinxiEntity> wrapper);
   	
   	QicaixinxiVO selectVO(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
   	
   	List<QicaixinxiView> selectListView(Wrapper<QicaixinxiEntity> wrapper);
   	
   	QicaixinxiView selectView(@Param("ew") Wrapper<QicaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicaixinxiEntity> wrapper);
   	
}

