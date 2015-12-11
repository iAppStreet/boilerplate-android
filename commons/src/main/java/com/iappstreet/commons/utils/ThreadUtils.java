package com.iappstreet.commons.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
public class ThreadUtils {
    private static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private static ExecutorService defaultExecutorService = new ThreadPoolExecutor(
            NUMBER_OF_CORES, // Initial pool size
            NUMBER_OF_CORES, // Max pool size
            1, TimeUnit.SECONDS,
            new LinkedBlockingQueue<Runnable>());

    private ThreadUtils() {
    }

    public static ExecutorService getDefaultExecutorService() {
        return defaultExecutorService;
    }

}
