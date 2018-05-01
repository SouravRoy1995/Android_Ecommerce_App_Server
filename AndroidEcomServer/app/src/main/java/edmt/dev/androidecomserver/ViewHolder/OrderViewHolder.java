package edmt.dev.androidecomserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edmt.dev.androidecomserver.Interface.ItemCLickListener;
import edmt.dev.androidecomserver.R;

/**
 * Created by User on 1/7/2018.
 */


//implements View.OnClickListener,
//        View.OnLongClickListener,
//        View.OnCreateContextMenuListener

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;

    public Button btnEdit,btnRemove,btnDetail,btnDirection;

    //private ItemCLickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);

        //EDIT DELETE DETAIL BUTTON

        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);
        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);


//        itemView.setOnClickListener(this);
//        itemView.setOnLongClickListener(this);
//        itemView.setOnCreateContextMenuListener(this);
    }


//    public void setItemClickListener(ItemCLickListener itemClickListener) {
//        this.itemClickListener = itemClickListener;
//    }

//    @Override
//    public void onClick(View view) {
//
//        itemClickListener.onClick(view,getAdapterPosition(),false);
//    }

//    @Override
//    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
//        contextMenu.setHeaderTitle("Select The Action");
//
//        contextMenu.add(0,0,getAdapterPosition(),"Update");
//        contextMenu.add(0,1,getAdapterPosition(),"Delete");
//
//    }

//    @Override
//    public boolean onLongClick(View view) {
//        itemClickListener.onClick(view,getAdapterPosition(),true);
//        return true;
//    }


}
