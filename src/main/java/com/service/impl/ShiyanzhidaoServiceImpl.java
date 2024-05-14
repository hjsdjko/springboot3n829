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


import com.dao.ShiyanzhidaoDao;
import com.entity.ShiyanzhidaoEntity;
import com.service.ShiyanzhidaoService;
import com.entity.vo.ShiyanzhidaoVO;
import com.entity.view.ShiyanzhidaoView;

@Service("shiyanzhidaoService")
public class ShiyanzhidaoServiceImpl extends ServiceImpl<ShiyanzhidaoDao, ShiyanzhidaoEntity> implements ShiyanzhidaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanzhidaoEntity> page = this.selectPage(
                new Query<ShiyanzhidaoEntity>(params).getPage(),
                new EntityWrapper<ShiyanzhidaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanzhidaoEntity> wrapper) {
		  Page<ShiyanzhidaoView> page =new Query<ShiyanzhidaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanzhidaoVO> selectListVO(Wrapper<ShiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanzhidaoVO selectVO(Wrapper<ShiyanzhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanzhidaoView> selectListView(Wrapper<ShiyanzhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanzhidaoView selectView(Wrapper<ShiyanzhidaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
