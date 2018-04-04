package com.zhibo.springcloud.vo;

import java.util.Date;

public class WorkOrderVO {
    private Integer id;
    private Integer projectid;
    private String executor;
    private Integer orderlevel;
    private Date createdate;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Integer getOrderlevel() {
        return orderlevel;
    }

    public void setOrderlevel(Integer orderlevel) {
        this.orderlevel = orderlevel;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
