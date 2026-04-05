---
name: auto-created-table
description: 指定表名和字段，然后自动生成后端代码和SQL，类似于知识库的自动生成代码
---

# 后端代码自动生成

## 快速开始

1. 先判断有没有指定表名、字段名这些
2. 如果指定了，就按照指定的信息生成
3. 如果没指定，就读取同级目录下table-info.md文件获取表定义信息。
## 核心能力

### 1. 获取项目名

- 一般项目的根目录坐在的文件夹名称就是项目名称，文件夹名称用-隔开，最后一个就是项目名称projectname。

### 2. 确定表的基本信息

- 读取同级目录下table-info.md文件，该文件使用Markdown格式，可被直接读取。
- 文件第一行格式为：`表描述 | 表名`，用竖线分隔。
- 从第三行开始是字段定义，每行一个字段，格式为：`字段名 | 字段描述 | 字段类型`，用竖线分隔。
- 示例如下：

```markdown
排程任务日志 | lims_schedule_task_log

字段名 | 字段描述 | 字段类型
---|---|---
id | 主键 | varchar(64)
taskId | 任务ID | varchar(64)
taskName | 任务名称 | varchar(200)
taskStatus | 任务状态 | varchar(20)
startTime | 开始时间 | datetime
endTime | 结束时间 | datetime
remark | 备注 | text
```

- 如果table-info.md不存在，提示用户先创建该文件，并给出上述示例格式。

### 3. 生成代码

- 代码路径默认是com.sunwayworld.lims.module.sp.folder，最后两级文件夹需要询问用户，让用户决定。
- 询问用户是否有工作流
  - 如果有工作流，参考同级目录下auditCode文件夹里面的代码。
  - 如果没有工作流，参考同级目录下normalCode文件夹里面的代码。

