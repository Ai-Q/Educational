package com.Educational.mapper;

import com.Educational.entity.StudentWriteGrade;
import com.Educational.entity.StudentWriteGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentWriteGradeMapper {
    int countByExample(StudentWriteGradeExample example);

    int deleteByExample(StudentWriteGradeExample example);

    int deleteByPrimaryKey(Integer writeGradeId);

    int insert(StudentWriteGrade record);

    int insertSelective(StudentWriteGrade record);

    List<StudentWriteGrade> selectByExample(StudentWriteGradeExample example);

    StudentWriteGrade selectByPrimaryKey(Integer writeGradeId);

    int updateByExampleSelective(@Param("record") StudentWriteGrade record, @Param("example") StudentWriteGradeExample example);

    int updateByExample(@Param("record") StudentWriteGrade record, @Param("example") StudentWriteGradeExample example);

    int updateByPrimaryKeySelective(StudentWriteGrade record);

    int updateByPrimaryKey(StudentWriteGrade record);
}