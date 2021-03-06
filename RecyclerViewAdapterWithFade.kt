
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}#end

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.spot.spot.R

class ${NAME} : RecyclerView.Adapter<${Model}Adapter.ViewHolder>() {

    var data: MutableList<${Model}> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
        
    var onItemAction: ((${Model}) -> Unit) = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewHolder = ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.${Item_Layout_ID},
                parent,
                false
            )
        )

        viewHolder.itemView.setOnClickListener {
            onItemAction(data[viewHolder.adapterPosition])
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(data[position])
    
    override fun getItemCount() = data.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: ${Model}) = with(itemView) {
            // TODO: Bind the data with View
        }
    }
}