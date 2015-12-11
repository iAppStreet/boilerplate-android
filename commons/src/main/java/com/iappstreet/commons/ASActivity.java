package com.iappstreet.commons;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.iappstreet.commons.views.Decorators;
import com.mounacheikhna.decor.DecorContextWrapper;
import com.mounacheikhna.decor.Decorator;
import com.mounacheikhna.decorators.FontDecorator;

import butterknife.ButterKnife;

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
public class ASActivity extends AppCompatActivity {

    protected final String LOG_TAG = this.getClass().getSimpleName();
    protected final String LIFE_TAG = "[LIFECYCLE] " + LOG_TAG;
    protected boolean isFirstLaunch = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isFirstLaunch = (savedInstanceState == null);
        Application.log().v(LIFE_TAG, isFirstLaunch ? "onCreate [first-launch]" : "onCreate [restarted]");
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Application.log().v(LIFE_TAG, "onAttachFragment: " + fragment.getClass().getSimpleName());
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Application.log().v(LIFE_TAG, "onContentChanged");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Application.log().v(LIFE_TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Application.log().v(LIFE_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Application.log().v(LIFE_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Application.log().v(LIFE_TAG, "onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Application.log().v(LIFE_TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Application.log().v(LIFE_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        Application.log().v(LIFE_TAG, "onDestroy");
    }

    /**
     * Override this to return a custom list of decorators
     *
     * @return a single object array with just a FontDecorator
     */
    protected Decorator[] getDecorators() {
        return new Decorators()
                .with(new FontDecorator())
                .get();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(DecorContextWrapper.wrap(newBase)
                .with(getDecorators()));
    }
}
