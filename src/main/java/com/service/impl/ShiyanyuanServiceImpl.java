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


import com.dao.ShiyanyuanDao;
import com.entity.ShiyanyuanEntity;
import com.service.ShiyanyuanService;
import com.entity.vo.ShiyanyuanVO;
import com.entity.view.ShiyanyuanView;

@Service("shiyanyuanService")
public class ShiyanyuanServiceImpl extends ServiceImpl<ShiyanyuanDao, ShiyanyuanEntity> implements ShiyanyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanyuanEntity> page = this.selectPage(
                new Query<ShiyanyuanEntity>(params).getPage(),
                new EntityWrapper<ShiyanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanyuanEntity> wrapper) {
		  Page<ShiyanyuanView> page =new Query<ShiyanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanyuanVO> selectListVO(Wrapper<ShiyanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanyuanVO selectVO(Wrapper<ShiyanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanyuanView> selectListView(Wrapper<ShiyanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanyuanView selectView(Wrapper<ShiyanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
