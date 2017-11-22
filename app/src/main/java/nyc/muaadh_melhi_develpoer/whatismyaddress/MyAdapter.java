package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by c4q on 11/21/17.
 */

class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<MyList> mylist;



    public MyAdapter(List<MyList> mylist) {
        this.mylist = mylist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_support_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    holder.bind(mylist.get(position));
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }
}
