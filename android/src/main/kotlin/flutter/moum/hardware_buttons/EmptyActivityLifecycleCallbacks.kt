package flutter.moum.hardware_buttons

import android.app.Activity
import android.app.Application
import android.app.FragmentActivity
import android.os.Bundle


open class EmptyActivityLifecycleCallbacks: Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(activity: FragmentActivity?) { }

    override fun onActivityResumed(activity: FragmentActivity?) { }

    override fun onActivityStarted(activity: FragmentActivity?) { }

    override fun onActivityDestroyed(activity: FragmentActivity?) { }

    override fun onActivitySaveInstanceState(activity: FragmentActivity?, outState: Bundle?) { }

    override fun onActivityStopped(activity: FragmentActivity?) { }

    override fun onActivityCreated(activity: FragmentActivity?, savedInstanceState: Bundle?) { }
}