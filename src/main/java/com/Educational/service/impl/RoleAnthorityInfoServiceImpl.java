package com.Educational.service.impl;

import com.Educational.mapper.RoleAnthorityInfoMore;
import com.Educational.service.RoleAnthorityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @outhor Mr.Huang
 * @create 2019:06:05 17:08
 */
@Service
public class RoleAnthorityInfoServiceImpl implements RoleAnthorityInfoService {
    @Autowired
    private RoleAnthorityInfoMore mapper;
    @Override
    public List<RoleAnthorityInfoMore> findAnthortyAll(int roleId, int anthortyId) {
        System.out.println("到达serviceImpl");
        List<RoleAnthorityInfoMore> anthortyAll = mapper.findAnthortyAll(roleId, anthortyId);
        System.out.println(anthortyAll);
        return anthortyAll;
    }
}
