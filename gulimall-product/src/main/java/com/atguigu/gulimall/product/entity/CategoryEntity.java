package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ??Ʒ???????
 * 
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-25 23:11:31
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long catId;
	/**
	 * ???????
	 */
	private String name;
	/**
	 * ??????id
	 */
	private Long parentCid;
	/**
	 * ?㼶
	 */
	private Integer catLevel;
	/**
	 * ?Ƿ???ʾ[0-????ʾ??1??ʾ]
	 */
	private Integer showStatus;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ͼ????ַ
	 */
	private String icon;
	/**
	 * ??????λ
	 */
	private String productUnit;
	/**
	 * ??Ʒ????
	 */
	private Integer productCount;

}
