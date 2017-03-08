package com.hanbit.contactsapp.serviceImpl;

import com.hanbit.contactsapp.domain.MemberBean;
import com.hanbit.contactsapp.service.MemberService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanbit on 2017-03-08.
 */

public class MemberServiceImpl implements MemberService{

    public MemberServiceImpl() {
    }

    @Override
    public void regist(MemberBean member) {

    }

    @Override
    public MemberBean findbyOne(MemberBean member) {
        MemberBean bean = new MemberBean();
        return bean;
    }

    @Override
    public List<MemberBean> findbySome(MemberBean member) {
        List<MemberBean> some = new ArrayList<>();
        return some;
    }

    @Override
    public List<MemberBean> list(MemberBean member) {
        List<MemberBean> list = new ArrayList<>();
        return list;
    }

    @Override
    public void update(MemberBean member) {

    }

    @Override
    public void delete(MemberBean member) {

    }
}
