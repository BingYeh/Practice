package com.yeh.bezier.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

/**
 * Created by bestv-developer on 16/5/25.
 *
 * @author bing
 * @time 16/5/25 下午5:15
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class BeziercurveLineActivity extends Activity {

    private RadioGroup mRadioGroup;
    private BezierThree mBezierThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_beziercurve_line);

        init();

        bindEvents();
    }

    private void init() {
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_control_group);
        mBezierThree = (BezierThree) findViewById(R.id.bezier_three);
    }

    private void bindEvents() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //Project -> Library
                //I've replaced the switch/case statement with if/else.
                if (checkedId == R.id.rb_control1) {
                    mBezierThree.setMode(true);
                } else if (checkedId == R.id.rb_control2) {
                    mBezierThree.setMode(false);
                }
//                switch (checkedId) {
//                    case R.id.rb_control1
//                        mBezierThree.setMode(true);
//                        break;
//                    case R.id.rb_control2:
//                        mBezierThree.setMode(false);
//                        break;
//                    default:
//                        break;
//                }
            }
        });
    }
}
