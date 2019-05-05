package com.example.administrator.ui_all_four;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.*;

public class MainActivity extends AppCompatActivity{
    private ListView listView;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uifourt);
        listView=(ListView)findViewById(R.id.lv);
        simpleAdapter=new SimpleAdapter(this,getData(),R.layout.uifouro,new String[]{"pic","text"},new int[]{R.id.iv,R.id.tv});
        listView.setAdapter(simpleAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                mode.setTitle(listView.getCheckedItemCount()+" selected");
            }
            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.i1:
                        mode.finish();
                        return true;
                    default:
                        return false;
                }
            }
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.menufour, menu);
                return true;
            }
            @Override
            public void onDestroyActionMode(ActionMode mode) {
            }
            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }
        });
    }
    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();
        Map<String,Object> map=new HashMap<String, Object>() ;
        map.put("pic",R.mipmap.ic_launcher_round);
        map.put("text","One");
        list.add(map);
        map=new HashMap<String, Object>();
        map.put("pic",R.mipmap.ic_launcher_round);
        map.put("text","Two");
        list.add(map);
        map=new HashMap<String, Object>();
        map.put("pic",R.mipmap.ic_launcher_round);
        map.put("text","Three");
        list.add(map);
        map=new HashMap<String, Object>();
        map.put("pic",R.mipmap.ic_launcher_round);
        map.put("text","Four");
        list.add(map);
        map=new HashMap<String, Object>();
        map.put("pic",R.mipmap.ic_launcher_round);
        map.put("text","Five");
        list.add(map);
        return list;
    }
}