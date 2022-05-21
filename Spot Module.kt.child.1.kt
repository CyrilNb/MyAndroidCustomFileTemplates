package ${PACKAGE_NAME}

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import java.lang.ref.WeakReference

class ${NAME}Router(var activity: WeakReference<AppCompatActivity>) {

	companion object {
        fun startFrom(activity: Activity) {
            Intent(activity, ${NAME}Activity::class.java)
            .run { activity.startActivity(this) }
        }

        fun configure(activity: ${NAME}Activity) {
            val weakActivity = WeakReference(activity)
    
            val router = ${NAME}Router(WeakReference(activity))
            val interactor = ${NAME}Interactor()
            val presenter = ${NAME}Presenter(weakActivity, interactor, router)
    
            activity.presenter = presenter
        }
    }

	fun dismiss() {
 		activity.get()?.onBackPressed()
	}
}