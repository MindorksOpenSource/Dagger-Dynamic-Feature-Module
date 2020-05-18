package com.mindorks.sample.feature.three.di.component

import com.mindorks.dagger.multi.module.base.di.component.BaseComponent
import com.mindorks.sample.feature.three.FeatureThreeActivity
import com.mindorks.sample.feature.three.di.module.FeatureThreeModule
import com.mindorks.sample.feature.three.di.scopes.FeatureThreeScope
import dagger.Component

@FeatureThreeScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [FeatureThreeModule::class]
)
interface FeatureThreeComponent {

    fun inject(activity: FeatureThreeActivity)

}