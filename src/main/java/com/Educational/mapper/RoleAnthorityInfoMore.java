package com.Educational.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @outhor Mr.Huang
 * @create 2019:06:05 16:54
 */
@Component
public interface RoleAnthorityInfoMore {
    /*根据角色查询所拥有权限*/
    public List<RoleAnthorityInfoMore> findAnthortyAll(@Param("roleId") int roleId,@Param("anthortyId") int anthortyId);
}

