package com.entity.view;

import com.entity.ShiyanzhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验指导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("shiyanzhidao")
public class ShiyanzhidaoView  extends ShiyanzhidaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanzhidaoView(){
	}
 
 	public ShiyanzhidaoView(ShiyanzhidaoEntity shiyanzhidaoEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanzhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
