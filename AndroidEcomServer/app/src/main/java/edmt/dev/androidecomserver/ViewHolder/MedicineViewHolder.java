package edmt.dev.androidecomserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import edmt.dev.androidecomserver.Common.Common;
import edmt.dev.androidecomserver.Interface.ItemCLickListener;
import edmt.dev.androidecomserver.R;

/**
 * Created by User on 1/7/2018.
 */

public class MedicineViewHolder extends RecyclerView.ViewHolder implements

        View.OnClickListener,
        View.OnCreateContextMenuListener

{

    public TextView medicine_name;
    public ImageView medicine_image;

    private ItemCLickListener itemClickListener;

    public MedicineViewHolder(View itemView) {
        super(itemView);

        medicine_name = (TextView)itemView.findViewById(R.id.medicine_name);
        medicine_image = (ImageView) itemView.findViewById(R.id.medicine_image);


        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemCLickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view,getAdapterPosition(),false);

    }


    //UPDATE PRODUCT DELETE PRODUCT
    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");

        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,1,getAdapterPosition(), Common.DELETE);

    }
}
