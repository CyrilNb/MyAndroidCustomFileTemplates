class MyAdapter : RecyclerView.Adapter<ViewHolder>() {
    private var tasks: List<Task> = arrayListOf()

    /// [...]

    private val simpleItemTouchCallback =
        object : ItemTouchHelper.SimpleCallback(
           // [1] The allowed directions for moving (drag-and-drop) items
           UP or DOWN or START or END, 
           // [2] The allowed directions for swiping items
           0) {
            override fun onMove(
                recyclerView: RecyclerView, 
                viewHolder: RecyclerView.ViewHolder, 
                target: RecyclerView.ViewHolder): Boolean {
                    // [3] Do something when an item is moved
                    
                    val adapter = recyclerView.adapter
                    val from = viewHolder.adapterPosition
                    val to = target.adapterPosition

                    // [4] Keep up-to-date the underlying data set
                    Collections.swap(tasks, from, to)
                    // [5] Tell the adapter to switch the 2 items
                    adapter?.notifyItemMoved(from, to)

                    return true
            }

            override fun onSwiped(
                viewHolder: RecyclerView.ViewHolder, 
                direction: Int) {
                    // [6] Do something when an item is swiped
            }
            
            override fun clearView(
                recyclerView: RecyclerView, 
                viewHolder: RecyclerView.ViewHolder) {
                    super.clearView(recyclerView, viewHolder);
                    // [7] Do something when the interaction with an item 
                    // is complete
            }
}

// then attch it to the recyclerview ItemTouchHelper(simpleItemTouchCallback).attachToRecyclerView(recyclerView)