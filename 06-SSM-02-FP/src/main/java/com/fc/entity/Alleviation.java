package com.fc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Alleviation {
    private Long id;

    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    private Date createTime;

    private String title;

    private String type;
    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    private Date releaseTime;

    private String cover;

    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    private Date lastClickTime;

    private Integer clickNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Date getLastClickTime() {
        return lastClickTime;
    }

    public void setLastClickTime(Date lastClickTime) {
        this.lastClickTime = lastClickTime;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

}