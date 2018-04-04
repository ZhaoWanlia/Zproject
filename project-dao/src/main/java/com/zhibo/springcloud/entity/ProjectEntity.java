package com.zhibo.springcloud.entity;

import org.apache.ibatis.type.Alias;

@Alias("Project")
public class ProjectEntity {
    private Integer id;
    private String projectName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
