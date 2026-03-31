package com.sunwayworld.lims.module.sp.folder.controller.impl;

import org.springframework.stereotype.Controller;
import com.sunwayworld.framework.spring.annotation.GikamBean;
import com.sunwayworld.lims.module.sp.folder.controller.LimsScheduleTaskLogController;
import com.sunwayworld.framework.log.annotation.Log;
import com.sunwayworld.framework.log.annotation.LogType;

@Controller
@GikamBean
public class LimsScheduleTaskLogControllerImpl implements LimsScheduleTaskLogController {

    @Log(value = "岗位交班编制列表页", type = LogType.CONTROLLER)
    @Override
    public String editListPage() {
        return "lims/module/sp/schedule-task-logs/lims-schedule-task-log-edit-list";
    }

    @Log(value = "岗位交班详情页", type = LogType.CONTROLLER)
    @Override
    public String detailPage() {
        return "lims/module/sp/schedule-task-logs/lims-schedule-task-log-detail";
    }

    @Log(value = "岗位交班查询列表页", type = LogType.CONTROLLER)
    @Override
    public String searchListPage() {
        return "lims/module/sp/schedule-task-logs/lims-schedule-task-log-search-list";
    }

    @Log(value = "岗位交班选择列表页", type = LogType.CONTROLLER)
    @Override
    public String choosePage() {
        return "lims/module/sp/schedule-task-logs/lims-schedule-task-log-choose-list";
    }

}
