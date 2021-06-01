package com.manuel28g.carsalesmobiletestrouter.covidtestdata

import android.content.Context
import au.com.carsales.basemodule.BaseModuleApplication

import au.com.carsales.basemodule.router.BaseModuleLifeCycleManager
import au.com.carsales.basemodule.router.Router

import com.manuel28g.carsalesmobiletestdata.service.CovidDataService

class RouterCovidApplication:BaseModuleApplication(){

    override fun initLifeCycleManager(): BaseModuleLifeCycleManager {
       return BaseModuleLifeCycleManager(this)
    }

    override fun onCreate() {
        super.onCreate()
    }
}

var mobileTestData: CovidDataService? = null

fun Context.getMobileTestData(): CovidDataService? {
    if (mobileTestData == null)
        mobileTestData = Router.getService(CovidDataService::class.java)
    return mobileTestData
}