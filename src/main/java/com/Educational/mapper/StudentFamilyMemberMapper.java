package com.Educational.mapper;

import com.Educational.entity.StudentFamilyMember;
import com.Educational.entity.StudentFamilyMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentFamilyMemberMapper {
    int countByExample(StudentFamilyMemberExample example);

    int deleteByExample(StudentFamilyMemberExample example);

    int deleteByPrimaryKey(Integer studentFamilyId);

    int insert(StudentFamilyMember record);

    int insertSelective(StudentFamilyMember record);

    List<StudentFamilyMember> selectByExample(StudentFamilyMemberExample example);

    StudentFamilyMember selectByPrimaryKey(Integer studentFamilyId);

    int updateByExampleSelective(@Param("record") StudentFamilyMember record, @Param("example") StudentFamilyMemberExample example);

    int updateByExample(@Param("record") StudentFamilyMember record, @Param("example") StudentFamilyMemberExample example);

    int updateByPrimaryKeySelective(StudentFamilyMember record);

    int updateByPrimaryKey(StudentFamilyMember record);
}