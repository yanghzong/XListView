package com.bwie.day1_rikao;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.day1_rikao.bean.ShowBean;

import java.util.List;
import java.util.logging.Handler;

/**
 * Created by 择木 on 2018/10/31.
 */

public class Adapter extends BaseAdapter {
    private Context context;
    private List<String> list;
    private ImageView imgShow;
    private TextView tvText;

    public Adapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();



    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            holder=new ViewHolder();
            convertView = View.inflate(context, R.layout.item_show, null);
            holder.imgShow = convertView.findViewById(R.id.img_show);
            holder.tvText = convertView.findViewById(R.id.tv_text);

            holder.tvText.setText(list.get(position));
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();

        }


        return convertView;
    }

    class ViewHolder{
        ImageView imgShow;
        TextView tvText;
    }
}
