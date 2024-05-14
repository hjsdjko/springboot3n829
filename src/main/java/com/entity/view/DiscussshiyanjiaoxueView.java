package com.entity.view;

import com.entity.DiscussshiyanjiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验教学评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("discussshiyanjiaoxue")
public class DiscussshiyanjiaoxueView  extends DiscussshiyanjiaoxueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshiyanjiaoxueView(){
	}
 
 	public DiscussshiyanjiaoxueView(DiscussshiyanjiaoxueEntity discussshiyanjiaoxueEntity){
 	try {
			BeanUtils.copyProperties(this, discussshiyanjiaoxueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
