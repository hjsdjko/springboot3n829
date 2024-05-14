package com.entity.model;

import com.entity.ShiyanzhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验指导
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public class ShiyanzhidaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 实验类型
	 */
	
	private String shiyanleixing;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 指导内容
	 */
	
	private String zhidaoneirong;
		
	/**
	 * 实验日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyanriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
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
	 * 设置：指导内容
	 */
	 
	public void setZhidaoneirong(String zhidaoneirong) {
		this.zhidaoneirong = zhidaoneirong;
	}
	
	/**
	 * 获取：指导内容
	 */
	public String getZhidaoneirong() {
		return zhidaoneirong;
	}
				
	
	/**
	 * 设置：实验日期
	 */
	 
	public void setShiyanriqi(Date shiyanriqi) {
		this.shiyanriqi = shiyanriqi;
	}
	
	/**
	 * 获取：实验日期
	 */
	public Date getShiyanriqi() {
		return shiyanriqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}
