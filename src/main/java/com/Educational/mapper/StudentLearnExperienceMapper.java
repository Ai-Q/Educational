package com.Educational.mapper;

import com.Educational.entity.StudentLearnExperience;
import com.Educational.entity.StudentLearnExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentLearnExperienceMapper {
    int countByExample(StudentLearnExperienceExample example);

    int deleteByExample(StudentLearnExperienceExample example);

    int deleteByPrimaryKey(Integer studentLearnId);

    int insert(StudentLearnExperience record);

    int insertSelective(StudentLearnExperience record);

    List<StudentLearnExperience> selectByExample(StudentLearnExperienceExample example);

    StudentLearnExperience selectByPrimaryKey(Integer studentLearnId);

    int updateByExampleSelective(@Param("record") StudentLearnExperience record, @Param("example") StudentLearnExperienceExample example);

    int updateByExample(@Param("record") StudentLearnExperience record, @Param("example") StudentLearnExperienceExample example);

    int updateByPrimaryKeySelective(StudentLearnExperience record);

    int updateByPrimaryKey(StudentLearnExperience record);
}