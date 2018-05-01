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
 * Created by User on 1/5/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements

        View.OnClickListener,
        View.OnCreateContextMenuListener

{

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemCLickListener itemClickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView = (ImageView) itemView.findViewById(R.id.menu_image);


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


    //UPDATE CATEGORY DELETE CATEGORY
    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");

        contextMenu.add(0,0,getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0,1,getAdapterPosition(), Common.DELETE);

    }
}