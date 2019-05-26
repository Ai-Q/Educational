package com.Educational.mapper;

import com.Educational.entity.StudentInfo;
import com.Educational.entity.StudentInfoExample;
import java.util.List;

import com.Educational.entity.StudentWriteGrade;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface StudentInfoMapper  extends Mapper< StudentInfo> {

}