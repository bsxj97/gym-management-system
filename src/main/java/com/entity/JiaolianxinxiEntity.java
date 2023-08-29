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
 * 教练信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
@TableName("jiaolianxinxi")
public class JiaolianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaolianxinxiEntity() {
		
	}
	
	public JiaolianxinxiEntity(T t) {
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
	 * 教练编号
	 */
					
	private String jiaolianbianhao;
	
	/**
	 * 教练姓名
	 */
					
	private String jiaolianxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 教练等级
	 */
					
	private String jiaoliandengji;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 预约状态
	 */
					
	private String yuyuezhuangtai;
	
	/**
	 * 教练介绍
	 */
					
	private String jiaolianjieshao;
	
	/**
	 * 教练图片
	 */
					
	private String jiaoliantupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：教练编号
	 */
	public void setJiaolianbianhao(String jiaolianbianhao) {
		this.jiaolianbianhao = jiaolianbianhao;
	}
	/**
	 * 获取：教练编号
	 */
	public String getJiaolianbianhao() {
		return jiaolianbianhao;
	}
	/**
	 * 设置：教练姓名
	 */
	public void setJiaolianxingming(String jiaolianxingming) {
		this.jiaolianxingming = jiaolianxingming;
	}
	/**
	 * 获取：教练姓名
	 */
	public String getJiaolianxingming() {
		return jiaolianxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：教练等级
	 */
	public void setJiaoliandengji(String jiaoliandengji) {
		this.jiaoliandengji = jiaoliandengji;
	}
	/**
	 * 获取：教练等级
	 */
	public String getJiaoliandengji() {
		return jiaoliandengji;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：预约状态
	 */
	public void setYuyuezhuangtai(String yuyuezhuangtai) {
		this.yuyuezhuangtai = yuyuezhuangtai;
	}
	/**
	 * 获取：预约状态
	 */
	public String getYuyuezhuangtai() {
		return yuyuezhuangtai;
	}
	/**
	 * 设置：教练介绍
	 */
	public void setJiaolianjieshao(String jiaolianjieshao) {
		this.jiaolianjieshao = jiaolianjieshao;
	}
	/**
	 * 获取：教练介绍
	 */
	public String getJiaolianjieshao() {
		return jiaolianjieshao;
	}
	/**
	 * 设置：教练图片
	 */
	public void setJiaoliantupian(String jiaoliantupian) {
		this.jiaoliantupian = jiaoliantupian;
	}
	/**
	 * 获取：教练图片
	 */
	public String getJiaoliantupian() {
		return jiaoliantupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
