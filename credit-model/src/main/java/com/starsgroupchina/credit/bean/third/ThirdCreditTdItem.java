package com.starsgroupchina.credit.bean.third;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel
@Data
public class ThirdCreditTdItem implements Serializable {


    @ApiModelProperty("检查项编号")
    private Long itemCode;

    @ApiModelProperty("检查项名称")
    private String itemName;

    @ApiModelProperty("风险等级")
    private String riskLevel;

    @ApiModelProperty("检查项分组")
    private String itemGroup;

    @ApiModelProperty("检测项目详情")
    private String details;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zc_credit_td_item
     *
     * @mbggenerated Tue Jun 12 09:19:07 CST 2018
     */
    private static final long serialVersionUID = 1L;

}