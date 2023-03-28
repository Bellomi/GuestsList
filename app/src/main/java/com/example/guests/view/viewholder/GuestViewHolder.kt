package com.example.guests.view.viewholder

import android.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.guests.databinding.RowGuestBinding
import com.example.guests.model.GuestModel
import com.example.guests.view.listener.OnGuestListener

//Esta classe dispara o codigo. os eventos que fazem ação estão aqui.
class GuestViewHolder(
    private val bind: RowGuestBinding,
    private val listener: OnGuestListener
) : RecyclerView.ViewHolder(bind.root) {

    fun bind(guest: GuestModel) {
        bind.textName.text = guest.name

        bind.textName.setOnClickListener {
            listener.onClick(guest.id)
        }

        bind.deleteBtn.setOnClickListener {

            AlertDialog.Builder(itemView.context)
                .setTitle("Guest Removal")
                .setMessage("Are you sure about removing this guest?")
                .setPositiveButton(
                    "Yes"
                ) { dialog, which ->
                    listener.onDelete(guest.id)
                }
                .setNegativeButton("Cancel", null)
                .create()
                .show()
            true
        }
    }
}