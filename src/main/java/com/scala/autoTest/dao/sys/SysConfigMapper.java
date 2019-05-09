package com.scala.autoTest.dao.sys;

import com.scala.autoTest.bean.sys.SysConfig;

public interface SysConfigMapper {
    int deleteByPrimaryKey(String variable);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(String variable);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}