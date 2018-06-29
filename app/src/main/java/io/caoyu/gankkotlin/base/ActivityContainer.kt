package io.caoyu.gankkotlin.base

import android.support.v7.app.AppCompatActivity

import java.util.LinkedList

/**
 * Created by caoyu on 2018/6/29/029.
 */

class ActivityContainer private constructor() {

    fun addActivity(aty: AppCompatActivity) {
        activityStack.add(aty)
    }

    fun removeActivity(aty: AppCompatActivity) {
        activityStack.remove(aty)
    }


    /**
     * 结束所有的Activity
     */
    fun finishAllActivity() {
        var i = 0
        val size = activityStack.size
        while (i < size) {
            if (null != activityStack[i]) {
                activityStack[i].finish()
            }
            i++
        }
        activityStack.clear()
    }

    companion object {

        val instance = ActivityContainer()
        private val activityStack = LinkedList<AppCompatActivity>()
    }
}
