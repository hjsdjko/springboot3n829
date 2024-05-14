package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实验信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-16 11:07:03
 */
@TableName("shiyanxinxi")
public class ShiyanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyanxinxiEntity() {
		
	}
	
	public ShiyanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 实验名称
	 */
					
	private String shiyanmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：实验名称
	 */
	public void setShiyanmingcheng(String shiyanmingcheng) {
		this.shiyanmingcheng = shiyanmingcheng;
	}
	/**
	 * 获取：实验名称
	 */
	public String getShiyanmingcheng() {
		return shiyanmingcheng;
	}
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
