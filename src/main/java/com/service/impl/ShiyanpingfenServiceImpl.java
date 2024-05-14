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


import com.dao.ShiyanpingfenDao;
import com.entity.ShiyanpingfenEntity;
import com.service.ShiyanpingfenService;
import com.entity.vo.ShiyanpingfenVO;
import com.entity.view.ShiyanpingfenView;

@Service("shiyanpingfenService")
public class ShiyanpingfenServiceImpl extends ServiceImpl<ShiyanpingfenDao, ShiyanpingfenEntity> implements ShiyanpingfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanpingfenEntity> page = this.selectPage(
                new Query<ShiyanpingfenEntity>(params).getPage(),
                new EntityWrapper<ShiyanpingfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanpingfenEntity> wrapper) {
		  Page<ShiyanpingfenView> page =new Query<ShiyanpingfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanpingfenVO> selectListVO(Wrapper<ShiyanpingfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanpingfenVO selectVO(Wrapper<ShiyanpingfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanpingfenView> selectListView(Wrapper<ShiyanpingfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanpingfenView selectView(Wrapper<ShiyanpingfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
