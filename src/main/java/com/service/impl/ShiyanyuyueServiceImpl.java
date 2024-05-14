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


import com.dao.ShiyanyuyueDao;
import com.entity.ShiyanyuyueEntity;
import com.service.ShiyanyuyueService;
import com.entity.vo.ShiyanyuyueVO;
import com.entity.view.ShiyanyuyueView;

@Service("shiyanyuyueService")
public class ShiyanyuyueServiceImpl extends ServiceImpl<ShiyanyuyueDao, ShiyanyuyueEntity> implements ShiyanyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanyuyueEntity> page = this.selectPage(
                new Query<ShiyanyuyueEntity>(params).getPage(),
                new EntityWrapper<ShiyanyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanyuyueEntity> wrapper) {
		  Page<ShiyanyuyueView> page =new Query<ShiyanyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanyuyueVO> selectListVO(Wrapper<ShiyanyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanyuyueVO selectVO(Wrapper<ShiyanyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanyuyueView> selectListView(Wrapper<ShiyanyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanyuyueView selectView(Wrapper<ShiyanyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
