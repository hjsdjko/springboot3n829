package com.entity.view;

import com.entity.QicaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 器材信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("qicaixinxi")
public class QicaixinxiView  extends QicaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicaixinxiView(){
	}
 
 	public QicaixinxiView(QicaixinxiEntity qicaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qicaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
