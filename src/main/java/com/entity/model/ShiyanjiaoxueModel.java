package com.entity.model;

import com.entity.ShiyanjiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验教学
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public class ShiyanjiaoxueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实验类型
	 */
	
	private String shiyanleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 教学视频
	 */
	
	private String jiaoxueshipin;
		
	/**
	 * 教学内容
	 */
	
	private String jiaoxueneirong;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：实验类型
	 */
	 
	public void setShiyanleixing(String shiyanleixing) {
		this.shiyanleixing = shiyanleixing;
	}
	
	/**
	 * 获取：实验类型
	 */
	public String getShiyanleixing() {
		return shiyanleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：教学视频
	 */
	 
	public void setJiaoxueshipin(String jiaoxueshipin) {
		this.jiaoxueshipin = jiaoxueshipin;
	}
	
	/**
	 * 获取：教学视频
	 */
	public String getJiaoxueshipin() {
		return jiaoxueshipin;
	}
				
	
	/**
	 * 设置：教学内容
	 */
	 
	public void setJiaoxueneirong(String jiaoxueneirong) {
		this.jiaoxueneirong = jiaoxueneirong;
	}
	
	/**
	 * 获取：教学内容
	 */
	public String getJiaoxueneirong() {
		return jiaoxueneirong;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
