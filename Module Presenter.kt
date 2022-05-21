package ${PACKAGE_NAME}

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import com.spot.spot.features.shared.Presenter
import java.lang.ref.WeakReference
import com.spot.spot.features.shared.misc.launch

class ${MODULE_NAME}Presenter(
    private val activity: WeakReference<${MODULE_NAME}Activity>,
    private val view: WeakReference<${MODULE_NAME}View>,
    private val interactor: ${MODULE_NAME}Interactor,
    private val router: ${MODULE_NAME}Router
) : Presenter() {

    val context: Context
        get() = activity.get()!!

	var viewModel by mutableStateOf(${MODULE_NAME}ViewModel.make())

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