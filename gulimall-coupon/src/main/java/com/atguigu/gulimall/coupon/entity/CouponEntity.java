package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?Ż?ȯ??Ϣ
 * 
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-25 23:38:42
 */
//@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ?Żݾ?????[0->ȫ????ȯ??1->??Ա??ȯ??2->??????ȯ??3->ע????ȯ]
	 */
	private Integer couponType;
	/**
	 * ?Ż?ȯͼƬ
	 */
	private String couponImg;
	/**
	 * ?Żݾ????
	 */
	private String couponName;
	/**
	 * ????
	 */
	private Integer num;
	/**
	 * ?
	 */
	private BigDecimal amount;
	/**
	 * ÿ??????????
	 */
	private Integer perLimit;
	/**
	 * ʹ???ż?
	 */
	private BigDecimal minPoint;
	/**
	 * ??ʼʱ?
	 */
	private Date startTime;
	/**
	 * ????ʱ?
	 */
	private Date endTime;
	/**
	 * ʹ??????[0->ȫ??ͨ?ã?1->ָ?????ࣻ2->ָ????Ʒ]
	 */
	private Integer useType;
	/**
	 * ??ע
	 */
	private String note;
	/**
	 * ????????
	 */
	private Integer publishCount;
	/**
	 * ??ʹ??????
	 */
	private Integer useCount;
	/**
	 * ??ȡ????
	 */
	private Integer receiveCount;
	/**
	 * ??????ȡ?Ŀ?ʼ???
	 */
	private Date enableStartTime;
	/**
	 * ??????ȡ?Ľ??????
	 */
	private Date enableEndTime;
	/**
	 * ?Ż??
	 */
	private String code;
	/**
	 * ??????ȡ?Ļ?Ա?ȼ?[0->???޵ȼ???????-??Ӧ?ȼ?]
	 */
	private Integer memberLevel;
	/**
	 * ????״̬[0-δ??????1-?ѷ???]
	 */
	private Integer publish;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCouponType() {
		return couponType;
	}

	public void setCouponType(Integer couponType) {
		this.couponType = couponType;
	}

	public String getCouponImg() {
		return couponImg;
	}

	public void setCouponImg(String couponImg) {
		this.couponImg = couponImg;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPerLimit() {
		return perLimit;
	}

	public void setPerLimit(Integer perLimit) {
		this.perLimit = perLimit;
	}

	public BigDecimal getMinPoint() {
		return minPoint;
	}

	public void setMinPoint(BigDecimal minPoint) {
		this.minPoint = minPoint;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getPublishCount() {
		return publishCount;
	}

	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}

	public Integer getUseCount() {
		return useCount;
	}

	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}

	public Integer getReceiveCount() {
		return receiveCount;
	}

	public void setReceiveCount(Integer receiveCount) {
		this.receiveCount = receiveCount;
	}

	public Date getEnableStartTime() {
		return enableStartTime;
	}

	public void setEnableStartTime(Date enableStartTime) {
		this.enableStartTime = enableStartTime;
	}

	public Date getEnableEndTime() {
		return enableEndTime;
	}

	public void setEnableEndTime(Date enableEndTime) {
		this.enableEndTime = enableEndTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(Integer memberLevel) {
		this.memberLevel = memberLevel;
	}

	public Integer getPublish() {
		return publish;
	}

	public void setPublish(Integer publish) {
		this.publish = publish;
	}
}
