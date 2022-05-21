package ${PACKAGE_NAME}

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import com.spot.spot.features.shared.Presenter
import java.lang.ref.WeakReference
import com.spot.spot.features.shared.misc.launch

class ${NAME}Presenter(
    private val activity: WeakReference<${NAME}Activity>,
    private val view: WeakReference<${NAME}View>,
    private val interactor: ${NAME}Interactor,
    private val router: ${NAME}Router
) : Presenter() {

    val context: Context
        get() = activity.get()!!

	var viewModel by mutableStateOf(${NAME}ViewModel.make())

	init {
        reload()
	}

	private fun reload() {
		launch {
		
		}
	}

	fun onDismiss() {
        router.dismiss()
	}
}