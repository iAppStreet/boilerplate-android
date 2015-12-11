package com.iappstreet.commons;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
public class ASFragment extends Fragment {

    protected final String LOG_TAG = this.getClass().getSimpleName();
    protected final String LIFE_TAG = "[LIFECYCLE] " + LOG_TAG;
    protected boolean isFirstLaunch = true;

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
        isFirstLaunch = (savedInstanceState == null);
        Application.log().v(LIFE_TAG, isFirstLaunch ? "onInflate [first-launch]" : "onInflate [restarted]");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Application.log().v(LIFE_TAG, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isFirstLaunch = (savedInstanceState == null);
        Application.log().v(LIFE_TAG, isFirstLaunch ? "onCreate [first-launch]" : "onCreate [restarted]");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Application.log().v(LIFE_TAG, "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        Application.log().v(LIFE_TAG, "onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Application.log().v(LIFE_TAG, "onActivityCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Application.log().v(LIFE_TAG, "onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Application.log().v(LIFE_TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Application.log().v(LIFE_TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Application.log().v(LIFE_TAG, "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Application.log().v(LIFE_TAG, "onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Application.log().v(LIFE_TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        Application.log().v(LIFE_TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Application.log().v(LIFE_TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Application.log().v(LIFE_TAG, "onDetach");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Application.log().v(LIFE_TAG, "onHidden " + (hidden ? "[VISIBLE]" : "[NOT VISIBLE]"));
    }
}
