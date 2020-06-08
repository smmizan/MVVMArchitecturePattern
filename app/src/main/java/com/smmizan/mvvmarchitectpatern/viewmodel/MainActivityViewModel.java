package com.smmizan.mvvmarchitectpatern.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    MutableLiveData<String> mutableLiveData;

    public MutableLiveData<String> calculateValue(String number1,String number2){

        int one = Integer.parseInt(number1);
        int two = Integer.parseInt(number2);

        int result = one + two;

        if(mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
        }

        mutableLiveData.setValue(String.valueOf(result));


        return mutableLiveData;

    }
}
