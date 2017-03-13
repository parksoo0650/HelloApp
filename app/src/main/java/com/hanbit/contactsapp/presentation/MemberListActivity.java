package com.hanbit.contactsapp.presentation;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hanbit.contactsapp.R;
import com.hanbit.contactsapp.dao.ListQuery;
import com.hanbit.contactsapp.domain.MemberBean;
import com.hanbit.contactsapp.service.ListService;

import java.util.ArrayList;

public class MemberListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        ListView mList = findViewById(R.id.mList);
        final MemberBean member = new MemberBean();
        final ArrayList<MemberBean> list=new ArrayList<>();
        findViewById(R.id.btGo).setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                    final MemberList mlist = new MemberList(MemberListActivity.this);
                    ListService service=new ListService() {
                        @Override
                        public ArrayList<?> list() {
                             ArrayList<?>list=mlist.list("SELECT _id AS id, name, phone,age, address,salary FROM Member;");
                            return list;
                        }
                    };
                Toast.makeText(MemberListActivity.this, list.get(0).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MemberListActivity.this, MemberDetailActivity.class);
                intent.putExtra("id","hong");
                startActivity(intent);
                    }
                    });
               }
    class MemberList extends ListQuery{
        public MemberList(Context context) {
            super(context);
        }

        @Override
        public ArrayList<?> list(String sql) {
            ArrayList list=new ArrayList<>();
            SQLiteDatabase db=this.getDatabase();
            Cursor cursor=db.rawQuery(sql,null);
            MemberBean bean=null;
            if(cursor!=null){
                if(cursor.moveToFirst()){
                    do{
                        bean = new MemberBean();
                        bean.setId(cursor.getString(cursor.getColumnIndex("id")));
                        bean.setName(cursor.getString(cursor.getColumnIndex("name")));
                        bean.setPhone(cursor.getString(cursor.getColumnIndex("phone")));
                        bean.setAge(cursor.getString(cursor.getColumnIndex("age")));
                        bean.setAddress(cursor.getString(cursor.getColumnIndex("address")));
                        bean.setSalary(cursor.getString(cursor.getColumnIndex("salary")));
                        list.add(bean);
                    }while(cursor.moveToNext());
                }
            }
            return list;
        }
        class MemberAdapter extends BaseAdapter{
            ArrayList<?> list;
            LayoutInflater inflater;
            private int[] photos={
                    R.drawable.cupcake,
                    R.drawable.donut,
                    R.drawable.eclair,
                    R.drawable.froyo,
                    R.drawable.gingerbread,
                    R.drawable.honeycomb,
                    R.drawable.icecream,
                    R.drawable.jellybean,
                    R.drawable.kitkat,
                    R.drawable.lollipop,
            };

            public MemberAdapter(ArrayList<?> list,Context context) {
                this.list = list;
                this.inflater=LayoutInflater.from(context); //풍선을 불 위치 값을 준다.
            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public Object getItem(int i) {
                return list.get(i);
            }

            @Override
            public long getItemId(int i) {
                return i;
            }

            @Override
            public View getView(int i,View v,ViewGroup g) {
                ViewHolder holder;
                if(v==null){
                    v=inflater.inflate(R.layout.member_item.null);
                    holder=new ViewHolder();
                    holder.profileImg=v.findViewById(R.id.profileImg);
                    holder.tvName=v.findViewById(R.id.tvName);
                    holder.tvPhone=findViewById(R.id.tvPhone);
                }else{
                    holder= (ViewHolder) v.getTag();
                }
                    holder.profileImg.setImageResource(photos[i]);
                    holder.tvName.setText(((MemberBean)list.get(i)).getName());
                    holder.tvPhone.setText(((MemberBean)list.get(i)).getName());
                    return v;
            }

        }

    }
    static class ViewHolder{
        ImageView profileImg;
        TextView tvName;
        TextView tvPhone;

    }
}

