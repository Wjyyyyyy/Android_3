实验三UI组件

# 实验三UI组件

1.
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401172539442.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

部分代码如下：
```
<
 public class uione extends AppCompatActivity {
    private String[] names = new String[]{"Lion", "Tiger", "Monkey", "Dog", "Cat", "elephant"};
    private int[] image = new int[]{R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog, R.drawable.cat, R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.animals);
        final int color1 = 0xFF0000;
        final int color2 = 0xFFFFFFFF;
        List<Map<String, Object>> ListItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", names[i]);
            listItem.put("images", image[i]);
            ListItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, ListItems, R.layout.animal, new String[]{"header", "images"}, new int[]{R.id.header, R.id.images});
        final ListView list = (ListView) findViewById(R.id.mylist);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int flag = 0;
                System.out.println(names[position] + position + "被单击");
                switch (flag) {
                    case 0:
                        view.setSelected(true);
                        CharSequence text = names[position];
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(uione.this, text, duration);
                        toast.show();
                        flag = 1;
                        break;
                    case 1:
                        view.setSelected(false);
                        CharSequence text1 = names[position];
                        int duration1 = Toast.LENGTH_SHORT;
                        Toast toast1 = Toast.makeText(uione.this, text1, duration1);
                        toast1.show();
                        flag = 0;
                        break;
                }
            }
        });
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(names[position] + "选中");
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
/>
```
部分布局代码如下:

```
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">
    <ListView
        android:id="@+id/mylist"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:listSelector="@color/colorAccent"
        >
    </ListView>
</LinearLayout>
```

截图如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401173311828.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

2.
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401173347643.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

部分代码如下：
```
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    View view2 = View.inflate(uitwo.this, R.layout.uitwoxml, null);
    final EditText username = (EditText) view2.findViewById(R.id.username);
    final EditText password = (EditText) view2.findViewById(R.id.password);
    final Button button = (Button) view2.findViewById(R.id. btn_login);
    final Button button1 = (Button) view2.findViewById(R.id.btn_cancel);
    builder.setTitle("自定义对话框").setIcon(R.drawable.header_logo).setView(view2);
    final AlertDialog alertDialog1 = builder.create();
    alertDialog1.show();
}
```
部分布局代码如下：

```
    <EditText
        android:id="@+id/username"
        android:layout_width="400dp"
        android:layout_height="wrap_content"
        android:hint="username:" />

    <EditText
        android:id="@+id/password"
        android:layout_width="400dp"
        android:layout_height="wrap_content"
        android:hint="password:" />

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_marginTop="50dp"
            android:orientation="horizontal">
            <Button
                android:id="@+id/btn_cancel"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="返回"
                android:textSize="20dp" />
        <Button
            android:id="@+id/btn_login"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="登陆"
            android:textSize="20dp" />
    </LinearLayout>
</LinearLayout>
```
截图如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401173651546.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)



3.
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401173832735.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)


部分代码如下：
```
public boolean onOptionsItemSelected(MenuItem mi){
    txt = (TextView)findViewById(R.id.txt);
    switch (mi.getItemId()){
        case R.id.font_10:
            txt.setTextSize(20);
            break;
        case R.id.font_16:
            txt.setTextSize(32);
            break;
        case R.id.font_20:
            txt.setTextSize(40);
            break;
        case R.id.red_font:
            txt.setTextColor(Color.RED);
            break;
        case R.id.black_font:
            txt.setTextColor(Color.BLACK);
            break;
        case R.id.plain_item:
            Toast toast =Toast.makeText(uithree.this,"这是普通单击项",Toast.LENGTH_SHORT);
            toast.show();
            break;
    }
    return true;
}

```
部分布局代码如下：
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:title="字体大小">
        <menu>
            <group>
                <item android:id="@+id/font_10"
                    android:title="小"/>
                <item android:id="@+id/font_16"
                    android:title="中"/>
                <item android:id="@+id/font_20"
                    android:title="大"/>
            </group>
        </menu>
    </item>
    <item
        android:id="@+id/plain_item"
        android:title="普通菜单项"/>
    <item
        android:title="字体颜色">
        <menu>
            <group>
                <item android:id="@+id/red_font"
                    android:title="红色"/>
                <item android:id="@+id/black_font"
                    android:title="黑色"/>
            </group>
        </menu>
    </item>
</menu>
```

截图如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401174218725.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401174239571.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401174250419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)

4.

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401174409515.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)



部分代码如下：
```
super.onCreate(savedInstanceState);
setContentView(R.layout.uifourt);
listView=(ListView)findViewById(R.id.lv);
simpleAdapter=new SimpleAdapter(this,getData(),R.layout.uifouro,new String[]{"pic","text"},new int[]{R.id.iv,R.id.tv});
listView.setAdapter(simpleAdapter);
listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
```

部分布局代码如下：

```
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/i1"
        android:title="删除" />
</menu>
```



截图如下：


![在这里插入图片描述](https://img-blog.csdnimg.cn/20190401174712720.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1NhbW11cmFtYXQ=,size_16,color_FFFFFF,t_70)











