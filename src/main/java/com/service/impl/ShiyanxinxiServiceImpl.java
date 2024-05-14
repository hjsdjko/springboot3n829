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


import com.dao.ShiyanxinxiDao;
import com.entity.ShiyanxinxiEntity;
import com.service.ShiyanxinxiService;
import com.entity.vo.ShiyanxinxiVO;
import com.entity.view.ShiyanxinxiView;

@Service("shiyanxinxiService")
public class ShiyanxinxiServiceImpl extends ServiceImpl<ShiyanxinxiDao, ShiyanxinxiEntity> implements ShiyanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanxinxiEntity> page = this.selectPage(
                new Query<ShiyanxinxiEntity>(params).getPage(),
                new EntityWrapper<ShiyanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanxinxiEntity> wrapper) {
		  Page<ShiyanxinxiView> page =new Query<ShiyanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanxinxiVO> selectListVO(Wrapper<ShiyanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanxinxiVO selectVO(Wrapper<ShiyanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanxinxiView> selectListView(Wrapper<ShiyanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanxinxiView selectView(Wrapper<ShiyanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
