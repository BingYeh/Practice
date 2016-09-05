package com.yeh.samplesbookone.app.activity;

import android.os.Bundle;

import com.yeh.samplesbookone.app.R;

/**
 * Created by bestv-developer on 16/9/4.
 *
 * @author bing
 * @time 16/9/4 下午8:17
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class SamplesBookActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_samples_book_main);

        initialize();

        bindEvents();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void initialize() {
        super.initialize();
    }

    @Override
    protected void bindEvents() {
        super.bindEvents();
    }
}
