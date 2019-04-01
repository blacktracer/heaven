package com.virgin.heaven.mapper;

import com.virgin.heaven.bean.vo.MemberVo;

public interface MemberMapper {
    //@Select("SELECT mobile_phone AS memberPhone,member_name AS memberName,create_time AS createTime FROM dw_member x WHERE x.id=3")
    MemberVo getMember();

    int addMember();
}
