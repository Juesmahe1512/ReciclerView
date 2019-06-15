package co.com.dju.pruebas

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import co.com.dju.pruebas.Utils.inflate
import kotlinx.android.synthetic.main.item.view.*

class AdapterItem(val data:List<ItemLanding>):RecyclerView.Adapter<AdapterItem.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder =
        Holder(parent.inflate(R.layout.item))

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindView(data[position])
    }

    override fun getItemCount(): Int = data.size


    class Holder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindView(itemLanding: ItemLanding){
            with(itemLanding){
                itemView.txt1.text = title
                itemView.txt2.text = titleDos
            }
        }
    }

}