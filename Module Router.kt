package ${PACKAGE_NAME}

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import java.lang.ref.WeakReference

class ${MODULE_NAME}Router(var activity: WeakReference<AppCompatActivity>) {

	companion object {
        fun startFrom(activity: Activity) {
            Intent(activity, ${MODULE_NAME}Activity::class.java)
            .run { activity.startActivity(this) }
        }

        fun configure(activity: ${MODULE_NAME}Activity) {
            val weakActivity = WeakReference(activity)
    
            val router = ${MODULE_NAME}Router(WeakReference(activity))
            val interactor = ${MODULE_NAME}Interactor()
            val presenter = ${MODULE_NAME}Presenter(weakActivity, interactor, router)
    
            activity.presenter = presenter
        }
    }

	fun dismiss() {
 		activity.get()?.onBackPressed()
	}
}