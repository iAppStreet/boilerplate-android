package com.iappstreet.commons;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import com.iappstreet.commons.logger.DefaultLogger;
import com.iappstreet.commons.logger.Logger;
import com.iappstreet.commons.logger.ProdLogger;
import com.iappstreet.commons.network.Network;

/**
 * Copyright 2015 App Street Software Pvt. Ltd.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class Application extends android.app.Application {

    private static Context sApp;

    @Override
    public void onCreate() {
        super.onCreate();

        sApp = this;
        Network.init(this);
    }

    public static Context appContext() {
        return sApp;
    }

    public static Resources R() {
        return sApp.getResources();
    }

    private static final Logger LOGGER = (BuildConfig.DEBUG ?
            new DefaultLogger(Log.VERBOSE) :
            new ProdLogger(Log.ERROR));
    public static Logger log() {
        return LOGGER;
    }

}
