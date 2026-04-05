岗位交班 | T_LIMS_SCHEDULE_TASK_LOG

字段名 | 字段描述 | 字段类型
---|---|---
id | 主键 | BIGINT NOT NULL
configId | 定时器任务主键 | VARCHAR(32)
param | 方法所需的参数（可以为空） | VARCHAR(96)
cron | CRON表达式 | VARCHAR(96)
startTime | 开始时间 | DATETIME
endTime | 结束时间 | DATETIME
success | 是否执行成功（0-否 1-是） | VARCHAR(36)
executedResult | 任务执行的业务结果 | VARCHAR(300)
createdById | 制单人编码 | VARCHAR(36)
createdByName | 制单人名称 | VARCHAR(60)
createdTime | 制单时间 | DATETIME
createdByOrgId | 制单人单位编码 | VARCHAR(36)
createdByOrgName | 制单人单位名称 | VARCHAR(270)
processStatus | 流程状态 | VARCHAR(36) DEFAULT 'draft'
