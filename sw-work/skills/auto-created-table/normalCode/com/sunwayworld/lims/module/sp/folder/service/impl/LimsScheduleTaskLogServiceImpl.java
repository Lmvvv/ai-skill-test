package com.sunwayworld.lims.module.sp.folder.service.impl;

import com.sunwayworld.framework.audit.aunnotation.Audit;
import com.sunwayworld.framework.audit.constant.AuditConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunwayworld.framework.spring.annotation.GikamBean;

import com.sunwayworld.lims.module.sp.folder.dao.LimsScheduleTaskLogDao;
import com.sunwayworld.lims.module.sp.folder.bean.LimsScheduleTaskLogBean;
import com.sunwayworld.lims.module.sp.folder.service.LimsScheduleTaskLogService;
import com.sunwayworld.framework.context.ApplicationContextHelper;
import com.sunwayworld.framework.restful.data.RestJsonWrapperBean;

@Repository
@GikamBean
public class LimsScheduleTaskLogServiceImpl implements LimsScheduleTaskLogService {

    @Autowired
    private LimsScheduleTaskLogDao limsScheduleTaskLogDao;

    @Override
    @SuppressWarnings("unchecked")
    public LimsScheduleTaskLogDao getDao() {
        return limsScheduleTaskLogDao;
    }

    @Override
    @Transactional
    @Audit(AuditConstant.INSERT)
    public Long insert(RestJsonWrapperBean jsonWrapper) {
        LimsScheduleTaskLogBean limsScheduleTaskLog = jsonWrapper.parseUnique(LimsScheduleTaskLogBean.class);
        limsScheduleTaskLog.setId(ApplicationContextHelper.getNextIdentity());
        getDao().insert(limsScheduleTaskLog);
        return limsScheduleTaskLog.getId();
    }

}
