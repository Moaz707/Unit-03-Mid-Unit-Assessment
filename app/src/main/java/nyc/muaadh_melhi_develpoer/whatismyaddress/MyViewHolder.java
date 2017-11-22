package nyc.muaadh_melhi_develpoer.whatismyaddress;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by c4q on 11/21/17.
 */

class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
    }


    public void bind(MyList myList) {

        textView = (TextView) itemView.findViewById(R.id.my_text_view);
        textView.setText(myList.getEmail());
        textView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent (v.getContext(), DisplayActivity.class);
        String str=textView.getText().toString();
        intent.putExtra("str",str);
        v.getContext().startActivity(intent);

    }
}
