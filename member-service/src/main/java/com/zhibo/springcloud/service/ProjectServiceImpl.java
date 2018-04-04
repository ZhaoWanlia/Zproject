package com.zhibo.springcloud.service;

import com.zhibo.springcloud.api.IProjectService;
import com.zhibo.springcloud.dto.ProjectDTO;
import com.zhibo.springcloud.dto.WorkOrderDTO;
import com.zhibo.springcloud.mapper.ProjectMapper;
import com.zhibo.springcloud.vo.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @PostMapping("/selectProject")
    @Override
    public List<ProjectDTO> selectProject(ProjectVO projectVO) {
        return projectMapper.query(BeanMap.create(projectVO));
    }

    @Override
    public List<WorkOrderDTO> selectAll(WorkOrderDTO workOrderDTO) {
        return projectMapper.selectAll(BeanMap.create(workOrderDTO));
    }

    @Override
    public int addProject(WorkOrderDTO workOrderDTO) {
        return 0;
    }
}
