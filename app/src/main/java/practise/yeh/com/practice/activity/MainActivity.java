package practise.yeh.com.practice.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.yeh.bezier.app.BeziercurveLineActivity;
import com.yeh.samplesbookone.app.activity.SamplesBookActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import practise.yeh.com.practice.R;
import practise.yeh.com.practice.util.Constants;

public class MainActivity extends BaseActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        bindEvents();
    }

    protected void initialize() {
        mGridView = (GridView) findViewById(R.id.grid_view);

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < Constants.itemArray.length; i++) {
            int drawableResId = (int) Constants.itemArray[i][0];
            String describe = Constants.itemArray[i][1].toString();
            //生成GridView adapter对象
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", drawableResId);
            map.put("text", describe);
            map.put("position", i);
            list.add(map);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.grid_list_item, new
                String[]{"image", "text"}, new int[]{R.id.grid_item_image, R.id
                .grid_item_describe});

        mGridView.setAdapter(simpleAdapter);
    }

    @Override
    protected void bindEvents() {
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                HashMap<String, Object> item = (HashMap<String, Object>) parent.getItemAtPosition(position);
                switch ((Integer) item.get("position")) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, BeziercurveLineActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, SamplesBookActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
