package com.hanbit.helloapp.serviceImpl;

import com.hanbit.helloapp.domain.CalcBean;
import com.hanbit.helloapp.service.CalcService;

/**
 * Created by hanbit on 2017-03-08.
 */
public class CalcServiceImpl implements CalcService{
    int result;
    @Override
    public int plus(CalcBean calc) {
        return calc.getFirstNum()+calc.getSecondNum();
    }

    @Override
    public int minus(CalcBean calc) {
        return calc.getFirstNum()-calc.getSecondNum();
    }

    @Override
    public int multi(CalcBean calc) {
        return calc.getFirstNum()*calc.getSecondNum();
    }

    @Override
    public int mod(CalcBean calc) {
        return calc.getFirstNum()%calc.getSecondNum();
    }

    @Override
    public int div(CalcBean calc) {
        return calc.getFirstNum()/calc.getSecondNum();
    }
}
