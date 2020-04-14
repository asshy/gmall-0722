package com.atguigu.gmall.pms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * InnoDB free: 8192 kB
 * 
 * @author yangdaoquan
 * @email 97394797@qq.com
 * @date 2020-04-12 20:27:24
 */
@ApiModel
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "")
	private Long id;
	/**
	 * 
	 */
	@ApiModelProperty(name = "branchId",value = "")
	private Long branchId;
	/**
	 * 
	 */
	@ApiModelProperty(name = "xid",value = "")
	private String xid;
	/**
	 * 
	 */
	@ApiModelProperty(name = "context",value = "")
	private String context;
	/**
	 * 
	 */
	@ApiModelProperty(name = "rollbackInfo",value = "")
	private Integer rollbackInfo;
	/**
	 * 
	 */
	@ApiModelProperty(name = "logStatus",value = "")
	private Integer logStatus;
	/**
	 * 
	 */
	@ApiModelProperty(name = "logCreated",value = "")
	private Date logCreated;
	/**
	 * 
	 */
	@ApiModelProperty(name = "logModified",value = "")
	private Date logModified;
	/**
	 * 
	 */
	@ApiModelProperty(name = "ext",value = "")
	private String ext;

}
