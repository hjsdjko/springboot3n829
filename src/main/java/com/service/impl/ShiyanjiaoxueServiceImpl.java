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


import com.dao.ShiyanjiaoxueDao;
import com.entity.ShiyanjiaoxueEntity;
import com.service.ShiyanjiaoxueService;
import com.entity.vo.ShiyanjiaoxueVO;
import com.entity.view.ShiyanjiaoxueView;

@Service("shiyanjiaoxueService")
public class ShiyanjiaoxueServiceImpl extends ServiceImpl<ShiyanjiaoxueDao, ShiyanjiaoxueEntity> implements ShiyanjiaoxueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanjiaoxueEntity> page = this.selectPage(
                new Query<ShiyanjiaoxueEntity>(params).getPage(),
                new EntityWrapper<ShiyanjiaoxueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanjiaoxueEntity> wrapper) {
		  Page<ShiyanjiaoxueView> page =new Query<ShiyanjiaoxueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanjiaoxueVO> selectListVO(Wrapper<ShiyanjiaoxueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanjiaoxueVO selectVO(Wrapper<ShiyanjiaoxueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanjiaoxueView> selectListView(Wrapper<ShiyanjiaoxueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanjiaoxueView selectView(Wrapper<ShiyanjiaoxueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
