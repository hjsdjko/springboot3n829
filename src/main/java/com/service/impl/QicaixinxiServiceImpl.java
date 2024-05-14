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


import com.dao.QicaixinxiDao;
import com.entity.QicaixinxiEntity;
import com.service.QicaixinxiService;
import com.entity.vo.QicaixinxiVO;
import com.entity.view.QicaixinxiView;

@Service("qicaixinxiService")
public class QicaixinxiServiceImpl extends ServiceImpl<QicaixinxiDao, QicaixinxiEntity> implements QicaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicaixinxiEntity> page = this.selectPage(
                new Query<QicaixinxiEntity>(params).getPage(),
                new EntityWrapper<QicaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicaixinxiEntity> wrapper) {
		  Page<QicaixinxiView> page =new Query<QicaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicaixinxiVO> selectListVO(Wrapper<QicaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicaixinxiVO selectVO(Wrapper<QicaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicaixinxiView> selectListView(Wrapper<QicaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicaixinxiView selectView(Wrapper<QicaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
