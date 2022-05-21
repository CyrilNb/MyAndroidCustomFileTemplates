import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.spot.spot.R

class ${NAME} @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(, this, true)
        
        initView()
        
        initListeners()
        
        buildUi()
    }
    
    private fun initView() {
    
    }
    
    private fun initListeners() {
    
    }
    
    private fun buildUi() {
    
    }
}