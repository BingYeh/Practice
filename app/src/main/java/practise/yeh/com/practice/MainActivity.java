package practise.yeh.com.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import practise.yeh.com.practice.beziercurve.BeziercurveLineActivity;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        bindEvents();
    }

    /**
     * initialize widget and data
     */
    private void init() {
        mGridView = (GridView) findViewById(R.id.grid_view);

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        initListData(list);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.grid_list_item, new
                String[]{"image", "text"}, new int[]{R.id.grid_item_image, R.id
                .grid_item_describe});

        mGridView.setAdapter(simpleAdapter);
    }

    /**
     * 初始化例子项
     */
    private void initListData(List<Map<String, Object>> list) {
        list.add(getMapItem(R.drawable.bezier, "贝塞尔曲线生成过程", 1));
    }

    private Map<String, Object> getMapItem(int drawableResId, String describe, int index) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("image", drawableResId);
        map.put("text", describe);
        map.put("position", index);
        return map;
    }

    /**
     * widget events
     */
    private void bindEvents() {
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO
                HashMap<String, Object> item = (HashMap<String, Object>) parent.getItemAtPosition(position);
                switch ((Integer) item.get("position")) {
                    case 0:
                        break;
                    case 1:
                        Intent intent = new Intent(MainActivity.this, BeziercurveLineActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
