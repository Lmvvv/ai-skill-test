package com.sunwayworld.lims.module.sp.folder.resource;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sunwayworld.lims.module.sp.folder.bean.LimsScheduleTaskLogBean;
import com.sunwayworld.lims.module.sp.folder.service.LimsScheduleTaskLogService;
import com.sunwayworld.framework.support.base.resource.GenericResource;
import com.sunwayworld.framework.support.choosable.resource.GenericChoosableResource;

@RequestMapping("/secure/lims/module/sp/schedule-task-logs")
public interface LimsScheduleTaskLogResource extends GenericResource<LimsScheduleTaskLogService, LimsScheduleTaskLogBean, Long>, GenericChoosableResource<LimsScheduleTaskLogService, LimsScheduleTaskLogBean, Long> {
}
