package com.Educational.service;

import com.Educational.mapper.RoleAnthorityInfoMore;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @outhor Mr.Huang
 * @create 2019:06:05 17:04
 */
public interface RoleAnthorityInfoService {
    /*根据角色查询所拥有权限*/
    public List<RoleAnthorityInfoMore> findAnthortyAll(int roleId,int anthortyId);
}
