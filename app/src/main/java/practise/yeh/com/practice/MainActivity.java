package practise.yeh.com.practice;

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

        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", R.drawable.test);
            map.put("text", String.format("test%d", i));
            list.add(map);
        }

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, list, R.layout.grid_list_item, new
                String[]{"image", "text"}, new int[]{R.id.grid_item_image, R.id
                .grid_item_describe});

        mGridView.setAdapter(simpleAdapter);
    }

    /**
     * widget events
     */
    private void bindEvents() {
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
