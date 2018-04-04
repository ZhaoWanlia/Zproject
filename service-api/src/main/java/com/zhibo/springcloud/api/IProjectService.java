package com.zhibo.springcloud.api;

import com.zhibo.springcloud.dto.ProjectDTO;
import com.zhibo.springcloud.dto.WorkOrderDTO;
import com.zhibo.springcloud.vo.ProjectVO;

import java.util.List;

public interface IProjectService {
    List<ProjectDTO>  selectProject(ProjectVO projectVO);
    List<WorkOrderDTO> selectAll(WorkOrderDTO workOrderDTO);
    int addProject(WorkOrderDTO workOrderDTO);
}
