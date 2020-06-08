package com.smmizan.mvvmarchitectpatern.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    public String calculateValue(String number1,String number2){

        int one = Integer.parseInt(number1);
        int two = Integer.parseInt(number2);

        int result = one + two;


        return String.valueOf(result);

    }
}
