package com.sunwayworld.lims.module.sp.folder.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunwayworld.lims.module.sp.folder.bean.LimsScheduleTaskLogBean;
import com.sunwayworld.lims.module.sp.folder.dao.LimsScheduleTaskLogDao;
import com.sunwayworld.lims.module.sp.folder.mapper.LimsScheduleTaskLogMapper;
import com.sunwayworld.framework.mybatis.dao.MybatisDaoSupport;
import com.sunwayworld.framework.spring.annotation.GikamBean;

@Repository
@GikamBean
public class LimsScheduleTaskLogDaoImpl extends MybatisDaoSupport<LimsScheduleTaskLogBean, Long> implements LimsScheduleTaskLogDao {

    @Autowired
    private LimsScheduleTaskLogMapper limsScheduleTaskLogMapper;

    @Override
    public LimsScheduleTaskLogMapper getMapper() {
        return limsScheduleTaskLogMapper;
    }

}
