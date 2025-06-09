package com.entity.vo;

import com.entity.ZuoyepigaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 作业批改
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 17:15:13
 */
public class ZuoyepigaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属科目
	 */
	
	private String suoshukemu;
		
	/**
	 * 学生作业
	 */
	
	private String xueshengzuoye;
		
	/**
	 * 评分
	 */
	
	private Integer pingfen;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 批改日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pigairiqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 院系班级
	 */
	
	private String yuanxibanji;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 老师姓名
	 */
	
	private String laoshixingming;
				
	
	/**
	 * 设置：所属科目
	 */
	 
	public void setSuoshukemu(String suoshukemu) {
		this.suoshukemu = suoshukemu;
	}
	
	/**
	 * 获取：所属科目
	 */
	public String getSuoshukemu() {
		return suoshukemu;
	}
				
	
	/**
	 * 设置：学生作业
	 */
	 
	public void setXueshengzuoye(String xueshengzuoye) {
		this.xueshengzuoye = xueshengzuoye;
	}
	
	/**
	 * 获取：学生作业
	 */
	public String getXueshengzuoye() {
		return xueshengzuoye;
	}
				
	
	/**
	 * 设置：评分
	 */
	 
	public void setPingfen(Integer pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public Integer getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：批改日期
	 */
	 
	public void setPigairiqi(Date pigairiqi) {
		this.pigairiqi = pigairiqi;
	}
	
	/**
	 * 获取：批改日期
	 */
	public Date getPigairiqi() {
		return pigairiqi;
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
	 * 设置：院系班级
	 */
	 
	public void setYuanxibanji(String yuanxibanji) {
		this.yuanxibanji = yuanxibanji;
	}
	
	/**
	 * 获取：院系班级
	 */
	public String getYuanxibanji() {
		return yuanxibanji;
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
	 * 设置：老师姓名
	 */
	 
	public void setLaoshixingming(String laoshixingming) {
		this.laoshixingming = laoshixingming;
	}
	
	/**
	 * 获取：老师姓名
	 */
	public String getLaoshixingming() {
		return laoshixingming;
	}
			
}
