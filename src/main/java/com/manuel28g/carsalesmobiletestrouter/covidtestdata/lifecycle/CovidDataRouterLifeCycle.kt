package com.manuel28g.carsalesmobiletestrouter.covidtestdata.lifecycle

import android.app.Application

import au.com.carsales.basemodule.router.BaseModuleLifeCycle
import au.com.carsales.basemodule.router.IModuleConfig

import com.manuel28g.carsalesmobiletestdata.service.CovidDataService
import com.manuel28g.carsalesmobiletestdata.service.CovidDataServiceImpl

open class CovidDataRouterLifeCycle(application: Application):
    BaseModuleLifeCycle(application)  {

    override fun onCreate(config: IModuleConfig) {
        super.onCreate(config)
        config.registerService(CovidDataService::class.java, CovidDataServiceImpl::class.java)
    }
}