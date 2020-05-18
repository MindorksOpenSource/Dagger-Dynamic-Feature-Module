package com.mindorks.sample.feature.three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mindorks.dagger.multi.module.base.data.DatabaseService
import com.mindorks.dagger.multi.module.base.data.NetworkService
import com.mindorks.dagger.multi.module.base.utils.InjectUtils
import com.mindorks.sample.feature.three.di.component.DaggerFeatureThreeComponent
import javax.inject.Inject

class FeatureThreeActivity : AppCompatActivity() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_three)

        DaggerFeatureThreeComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)

        Log.d("DaggerSample_Feature3", databaseService.toString())
    }
}
