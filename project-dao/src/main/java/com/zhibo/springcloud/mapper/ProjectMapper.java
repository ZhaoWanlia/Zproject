package com.zhibo.springcloud.mapper;

import com.zhibo.springcloud.entity.ProjectEntity;
import com.zhibo.springcloud.entity.WorkOrderEntity;

import java.util.List;
import java.util.Map;

public interface ProjectMapper {
    List<ProjectEntity> query(Map<String, Object> params);
    List<WorkOrderEntity> selectAll(Map<String, Object> params);
    int addProject(WorkOrderEntity workOrderEntity);
}
