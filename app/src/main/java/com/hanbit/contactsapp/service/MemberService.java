package com.hanbit.contactsapp.service;

import com.hanbit.contactsapp.domain.MemberBean;

import java.util.List;

/**
 * Created by hanbit on 2017-03-08.
 */

public interface MemberService {
    public void regist(MemberBean member);
    public MemberBean findbyOne(MemberBean member);
    public List<MemberBean> findbySome(MemberBean member);
    public List<MemberBean> list(MemberBean member);
    public void update(MemberBean member);
    public void delete(MemberBean member);
}
