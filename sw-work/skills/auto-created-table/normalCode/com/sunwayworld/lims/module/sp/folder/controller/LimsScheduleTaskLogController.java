package com.sunwayworld.lims.module.sp.folder.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sunwayworld.framework.controller.GenericEditListPageController;
import com.sunwayworld.framework.controller.GenericDetailPageController;
import com.sunwayworld.framework.controller.GenericSearchListPageController;
import com.sunwayworld.framework.controller.GenericChoosePageController;

@RequestMapping("/secure/lims/module/sp/schedule-task-logs/page")
public interface LimsScheduleTaskLogController extends GenericEditListPageController, GenericDetailPageController, GenericSearchListPageController, GenericChoosePageController {
}
