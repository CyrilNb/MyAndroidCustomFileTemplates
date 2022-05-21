package ${PACKAGE_NAME}

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.spot.spot.app.SpotTheme
import com.spot.spot.features.shared.SpotActivity

class ${NAME}Activity : SpotActivity() {
	lateinit var presenter: ${NAME}Presenter
	
    private val viewModel: ${NAME}ViewModel
        get() = presenter.viewModel

	override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // AnalyticsHelper.logEvent(${NAME}Analytics.OnAppeared)
        
        ${NAME}Router.configure(this)

        setContent {
            SpotTheme {
                Surface(color = SpotTheme.colors.background) {
                    ${NAME}View()
                 }
             }
         }
	}

    @Composable
    fun ${NAME}View() {
    
    }
}