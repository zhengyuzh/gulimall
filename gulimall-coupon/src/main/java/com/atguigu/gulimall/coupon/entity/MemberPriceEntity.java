package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ??Ա?۸
 * 
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-25 23:38:42
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ??Ա?ȼ?id
	 */
	private Long memberLevelId;
	/**
	 * ??Ա?ȼ???
	 */
	private String memberLevelName;
	/**
	 * ??Ա??Ӧ?۸
	 */
	private BigDecimal memberPrice;
	/**
	 * ?ɷ??????????Ż?[0-???ɵ????Żݣ?1-?ɵ???]
	 */
	private Integer addOther;

}
