package com.Educational.mapper;

import com.Educational.entity.CommunicateInfo;
import com.Educational.entity.CommunicateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunicateInfoMapper {
    int countByExample(CommunicateInfoExample example);

    int deleteByExample(CommunicateInfoExample example);

    int deleteByPrimaryKey(Integer communicateId);

    int insert(CommunicateInfo record);

    int insertSelective(CommunicateInfo record);

    List<CommunicateInfo> selectByExample(CommunicateInfoExample example);

    CommunicateInfo selectByPrimaryKey(Integer communicateId);

    int updateByExampleSelective(@Param("record") CommunicateInfo record, @Param("example") CommunicateInfoExample example);

    int updateByExample(@Param("record") CommunicateInfo record, @Param("example") CommunicateInfoExample example);

    int updateByPrimaryKeySelective(CommunicateInfo record);

    int updateByPrimaryKey(CommunicateInfo record);
}