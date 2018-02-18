package th.ac.up.agr.buffaloes.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.card_date.view.*

class ProsViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){

    val textView = itemView.card_date_text

    val title = itemView.card_date_title
    val layout = itemView.card_date_title_layout
    val layoutColor = layout.cardBackgroundColor


}