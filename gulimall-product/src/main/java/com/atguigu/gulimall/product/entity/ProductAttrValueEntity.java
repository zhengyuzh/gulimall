package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu????ֵ
 * 
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-25 23:11:31
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ??Ʒid
	 */
	private Long spuId;
	/**
	 * ????id
	 */
	private Long attrId;
	/**
	 * ??????
	 */
	private String attrName;
	/**
	 * ????ֵ
	 */
	private String attrValue;
	/**
	 * ˳?
	 */
	private Integer attrSort;
	/**
	 * ????չʾ???Ƿ?չʾ?ڽ????ϣ?0-?? 1-?ǡ?
	 */
	private Integer quickShow;

}
