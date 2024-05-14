package com.entity.view;

import com.entity.ShiyanyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("shiyanyuan")
public class ShiyanyuanView  extends ShiyanyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanyuanView(){
	}
 
 	public ShiyanyuanView(ShiyanyuanEntity shiyanyuanEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
