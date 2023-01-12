package top.zxqs.dao;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.StringJoiner;

public class TienchinChannel{
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long channelId;

    /**
     * 渠道名称
     */
    @Excel(name = "渠道名称")
    @NotEmpty(message = "渠道名称不能为空")
    private String channelName;

    /**
     * 渠道状态 0启动 1停止
     */
    @Excel(name = "渠道状态",prompt="请选择",combo="正常,禁用",readConverterExp="0=禁用,1=正常")
    @NotNull(message = "渠道状态不能为空")
    @Max(value = 1,message = "渠道状态最大为1")
    @Min(value = 0,message = "渠道状态最小为0")
    private String status;

    @Excel(name = "图片",cellType = Excel.ColumnType.IMAGE)
    private String image;
    /**
     * 渠道类型 1线上渠道，2线下渠道
     */
    @Excel(name = "渠道类型",prompt="请选择",combo="线上渠道,线下渠道",readConverterExp="1=线上渠道,2=线下渠道")
    @NotNull(message = "渠道类型不能为空")
    @Max(value = 2,message = "渠道类型最大为2")
    @Min(value = 1,message = "渠道类型最小为1")
    private Integer type;

    @Excel(name = "创建时间",dateFormat = "yyyy/MM/dd",type= Excel.Type.EXPORT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm")
    private Date createTime;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * $column.columnComment
     */
    private Integer delFlag;

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TienchinChannel.class.getSimpleName() + "[", "]")
                .add("channelId=" + channelId)
                .add("channelName='" + channelName + "'")
                .add("status='" + status + "'")
                .add("type=" + type)
                .add("delFlag=" + delFlag)
                .toString();
    }
}