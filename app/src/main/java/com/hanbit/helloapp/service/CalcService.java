package com.hanbit.helloapp.service;

import com.hanbit.helloapp.domain.CalcBean;

/**
 * Created by hanbit on 2017-03-08.
 */

public interface CalcService {
    public int plus(CalcBean calc);
    public int minus(CalcBean calc);
    public int multi(CalcBean calc);
    public int mod(CalcBean calc);
    public int div(CalcBean calc);



}
