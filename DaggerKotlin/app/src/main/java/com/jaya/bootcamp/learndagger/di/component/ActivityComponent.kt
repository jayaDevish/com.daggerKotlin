package com.jaya.bootcamp.learndagger.di.component

import com.jaya.bootcamp.learndagger.di.module.ActivityModule
import com.jaya.bootcamp.learndagger.di.ActivityScope
import com.jaya.bootcamp.learndagger.ui.main.MainActivity

import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}
