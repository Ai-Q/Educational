package com.Educational.mapper;

import com.Educational.entity.StudentGraduationThesis;
import com.Educational.entity.StudentGraduationThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentGraduationThesisMapper {
    int countByExample(StudentGraduationThesisExample example);

    int deleteByExample(StudentGraduationThesisExample example);

    int deleteByPrimaryKey(Integer studentPaperId);

    int insert(StudentGraduationThesis record);

    int insertSelective(StudentGraduationThesis record);

    List<StudentGraduationThesis> selectByExample(StudentGraduationThesisExample example);

    StudentGraduationThesis selectByPrimaryKey(Integer studentPaperId);

    int updateByExampleSelective(@Param("record") StudentGraduationThesis record, @Param("example") StudentGraduationThesisExample example);

    int updateByExample(@Param("record") StudentGraduationThesis record, @Param("example") StudentGraduationThesisExample example);

    int updateByPrimaryKeySelective(StudentGraduationThesis record);

    int updateByPrimaryKey(StudentGraduationThesis record);
}