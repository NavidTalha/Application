package com.example.test2

import android.annotation.SuppressLint
import android.app.job.JobScheduler
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.Completable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class SplashScreenActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Completable.timer(3,TimeUnit.SECONDS, AndroidSchedulers.mainThread()) .subscribe {

            Toast.makeText(
                this@SplashScreenActivity,
                "Splash Screen is Activated",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}