package com.sunwayworld.lims.module.sp.folder.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunwayworld.lims.module.sp.folder.resource.LimsScheduleTaskLogResource;
import com.sunwayworld.lims.module.sp.folder.service.LimsScheduleTaskLogService;
import com.sunwayworld.framework.spring.annotation.GikamBean;
import com.sunwayworld.framework.log.annotation.Log;
import com.sunwayworld.framework.log.annotation.LogModule;
import com.sunwayworld.framework.log.annotation.LogType;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;

@LogModule("岗位交班")
@RestController
@GikamBean
public class LimsScheduleTaskLogResourceImpl implements LimsScheduleTaskLogResource {

    @Autowired
    private LimsScheduleTaskLogService limsScheduleTaskLogService;

    @Override
    public LimsScheduleTaskLogService getService() {
        return limsScheduleTaskLogService;
    }

    @Log(value = "新增岗位交班", type = LogType.INSERT)
    @Override
    @RequestMapping(method = RequestMethod.POST)
    public Long insert(RestJsonWrapperBean wrapper) {
        return getService().insert(wrapper);
    }

}
