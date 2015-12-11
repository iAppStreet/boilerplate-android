package com.iappstreet.commons.logger;

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
public interface Logger {
    boolean isLoggable(String var1, int var2);

    int getLogLevel();

    void setLogLevel(int var1);

    void d(String var1, String var2, Throwable var3);

    void v(String var1, String var2, Throwable var3);

    void i(String var1, String var2, Throwable var3);

    void w(String var1, String var2, Throwable var3);

    void e(String var1, String var2, Throwable var3);

    void d(String var1, String var2);

    void v(String var1, String var2);

    void i(String var1, String var2);

    void w(String var1, String var2);

    void e(String var1, String var2);

    void log(int var1, String var2, String var3);

    void log(int var1, String var2, String var3, boolean var4);
}
