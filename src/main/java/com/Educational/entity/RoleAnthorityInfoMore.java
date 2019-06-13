package com.Educational.entity;

/**
 * @outhor Mr.Huang
 * @create 2019:06:05 16:56
 */
public class RoleAnthorityInfoMore extends RoleAnthorityInfo {
    private AnthortyInfo anthortyInfo;

    public AnthortyInfo getAnthortyInfo() {
        return anthortyInfo;
    }

    public void setAnthortyInfo(AnthortyInfo anthortyInfo) {
        this.anthortyInfo = anthortyInfo;
    }


    @Override
    public String toString() {
        return "RoleAnthorityInfoMore{" +
                "anthortyInfo=" + anthortyInfo +
                '}';
    }
}
