package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ?ɳ?ֵ?仯??ʷ??¼
 * 
 * @author zhengyuzhu
 * @email 2977429967@qq.com
 * @date 2023-02-26 12:11:44
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * ?ı???ֵ????????????
	 */
	private Integer changeCount;
	/**
	 * ??ע
	 */
	private String note;
	/**
	 * ??????Դ[0-???1-????Ա?޸?]
	 */
	private Integer sourceType;

}
