package com.entity.view;

import com.entity.ShiyanjiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验教学
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("shiyanjiaoxue")
public class ShiyanjiaoxueView  extends ShiyanjiaoxueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanjiaoxueView(){
	}
 
 	public ShiyanjiaoxueView(ShiyanjiaoxueEntity shiyanjiaoxueEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanjiaoxueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
