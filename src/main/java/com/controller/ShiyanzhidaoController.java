package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShiyanzhidaoEntity;
import com.entity.view.ShiyanzhidaoView;

import com.service.ShiyanzhidaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 实验指导
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@RestController
@RequestMapping("/shiyanzhidao")
public class ShiyanzhidaoController {
    @Autowired
    private ShiyanzhidaoService shiyanzhidaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanzhidaoEntity shiyanzhidao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shiyanzhidao.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shiyanzhidao.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shiyanyuan")) {
			shiyanzhidao.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanzhidaoEntity> ew = new EntityWrapper<ShiyanzhidaoEntity>();
		PageUtils page = shiyanzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanzhidao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanzhidaoEntity shiyanzhidao, 
		HttpServletRequest request){
        EntityWrapper<ShiyanzhidaoEntity> ew = new EntityWrapper<ShiyanzhidaoEntity>();
		PageUtils page = shiyanzhidaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanzhidao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanzhidaoEntity shiyanzhidao){
       	EntityWrapper<ShiyanzhidaoEntity> ew = new EntityWrapper<ShiyanzhidaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanzhidao, "shiyanzhidao")); 
        return R.ok().put("data", shiyanzhidaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanzhidaoEntity shiyanzhidao){
        EntityWrapper< ShiyanzhidaoEntity> ew = new EntityWrapper< ShiyanzhidaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanzhidao, "shiyanzhidao")); 
		ShiyanzhidaoView shiyanzhidaoView =  shiyanzhidaoService.selectView(ew);
		return R.ok("查询实验指导成功").put("data", shiyanzhidaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanzhidaoEntity shiyanzhidao = shiyanzhidaoService.selectById(id);
        return R.ok().put("data", shiyanzhidao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanzhidaoEntity shiyanzhidao = shiyanzhidaoService.selectById(id);
        return R.ok().put("data", shiyanzhidao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
    	shiyanzhidao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanzhidao);
        shiyanzhidaoService.insert(shiyanzhidao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
    	shiyanzhidao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanzhidao);
        shiyanzhidaoService.insert(shiyanzhidao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanzhidaoEntity shiyanzhidao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanzhidao);
        shiyanzhidaoService.updateById(shiyanzhidao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanzhidaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShiyanzhidaoEntity> wrapper = new EntityWrapper<ShiyanzhidaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("shiyanyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shiyanzhidaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
