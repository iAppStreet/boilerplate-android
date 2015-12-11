package com.iappstreet.commons.views;

import com.mounacheikhna.decor.Decorator;

import java.util.ArrayList;

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
public class Decorators {
    private ArrayList<Decorator> mDecorators;

    public Decorators() {
        mDecorators = new ArrayList<>();
    }

    public Decorators with(Decorator decorator) {
        mDecorators.add(decorator);
        return this;
    }

    public Decorator[] get() {
        Decorator[] tmp = new Decorator[mDecorators.size()];
        mDecorators.toArray(tmp);
        mDecorators.clear();
        return tmp;
    }

    public static Decorator[] getAll() {
        return com.mounacheikhna.decorators.Decorators.getAll();
    }
}
