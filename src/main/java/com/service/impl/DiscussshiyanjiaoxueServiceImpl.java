package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshiyanjiaoxueDao;
import com.entity.DiscussshiyanjiaoxueEntity;
import com.service.DiscussshiyanjiaoxueService;
import com.entity.vo.DiscussshiyanjiaoxueVO;
import com.entity.view.DiscussshiyanjiaoxueView;

@Service("discussshiyanjiaoxueService")
public class DiscussshiyanjiaoxueServiceImpl extends ServiceImpl<DiscussshiyanjiaoxueDao, DiscussshiyanjiaoxueEntity> implements DiscussshiyanjiaoxueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiyanjiaoxueEntity> page = this.selectPage(
                new Query<DiscussshiyanjiaoxueEntity>(params).getPage(),
                new EntityWrapper<DiscussshiyanjiaoxueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiyanjiaoxueEntity> wrapper) {
		  Page<DiscussshiyanjiaoxueView> page =new Query<DiscussshiyanjiaoxueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshiyanjiaoxueVO> selectListVO(Wrapper<DiscussshiyanjiaoxueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiyanjiaoxueVO selectVO(Wrapper<DiscussshiyanjiaoxueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiyanjiaoxueView> selectListView(Wrapper<DiscussshiyanjiaoxueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiyanjiaoxueView selectView(Wrapper<DiscussshiyanjiaoxueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
