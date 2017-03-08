package com.hanbit.contactsapp.dao;

import com.hanbit.contactsapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanbit on 2017-03-08.
 */

public class MemberDao {


    public void insert(MemberBean member) {

    }


    public MemberBean selectOne(MemberBean member) {
        MemberBean bean = new MemberBean();
        return bean;
    }


    public List<MemberBean> selectSome(MemberBean member) {
        List<MemberBean> some = new ArrayList<>();
        return some;
    }


    public List<MemberBean> selectAll(MemberBean member) {
        List<MemberBean> list = new ArrayList<>();
        return list;
    }


    public void update(MemberBean member) {

    }


    public void delete(MemberBean member) {

    }

}
