package tjeit.kr.algorithmpractice.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

import tjeit.kr.algorithmpractice.R;
import tjeit.kr.algorithmpractice.datas.Chat;

public class ChatAdapter extends ArrayAdapter<Chat> {

    Context mContext;
    List<Chat> mList;
    LayoutInflater inf;

    public ChatAdapter (Context context, List<Chat> list) {
        super(context, R.layout.chat_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.chat_list_item, null);
        }

        return row;
    }
}
