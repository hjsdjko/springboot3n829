package com.entity.vo;

import com.entity.ShiyanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 实验信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
public class ShiyanxinxiVO  implements Serializable {
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
	 * 实验地点
	 */
	
	private String shiyandidian;
		
	/**
	 * 实验时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyanshijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 实验内容
	 */
	
	private String shiyanneirong;
				
	
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
	 * 设置：实验地点
	 */
	 
	public void setShiyandidian(String shiyandidian) {
		this.shiyandidian = shiyandidian;
	}
	
	/**
	 * 获取：实验地点
	 */
	public String getShiyandidian() {
		return shiyandidian;
	}
				
	
	/**
	 * 设置：实验时间
	 */
	 
	public void setShiyanshijian(Date shiyanshijian) {
		this.shiyanshijian = shiyanshijian;
	}
	
	/**
	 * 获取：实验时间
	 */
	public Date getShiyanshijian() {
		return shiyanshijian;
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
	 * 设置：实验内容
	 */
	 
	public void setShiyanneirong(String shiyanneirong) {
		this.shiyanneirong = shiyanneirong;
	}
	
	/**
	 * 获取：实验内容
	 */
	public String getShiyanneirong() {
		return shiyanneirong;
	}
			
}
