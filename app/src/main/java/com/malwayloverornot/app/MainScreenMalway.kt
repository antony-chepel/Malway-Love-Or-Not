package com.malwayloverornot.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.malwayloverornot.app.databinding.ActivityMainScreenMalwayBinding
import com.malwayloverornot.app.mlwayloveutils.NukUtils
import kotlin.random.Random

class MainScreenMalway : AppCompatActivity() {
    private lateinit var binding : ActivityMainScreenMalwayBinding
    private var sqwersad = false
    private var vxcsasd: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenMalwayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pdsdsjfsds.setOnClickListener {
            hdsdsfwef()
        }
    }


    private fun hdsdsfwef() = with(binding){
        var counter = 0
        vxcsasd?.cancel()
        vxcsasd = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                counter++
                sqwersad = true
                pdsdsjfsds.alpha = 0.7f
                vcgfsada.visibility = View.GONE
                masksad.visibility = View.GONE
                if(counter>5) counter = 0
                sjsdjdsaj.setImageResource(NukUtils.nchhdshsd[counter])
            }

            override fun onFinish() {
                jasjdsad()
                sqwersad = false
                pdsdsjfsds.alpha = 1.0f
                vcgfsada.visibility = View.VISIBLE
                masksad.visibility = View.VISIBLE

            }

        }.start()

    }

    private fun jasjdsad() =with(binding) {
        val ndnsd = NukUtils.nchhdshsd[Random.nextInt(6)]
        val osdjfsdf = NukUtils.psdfsdfsd[Random.nextInt(8)]
        sjsdjdsaj.setImageResource(ndnsd)
        masksad.text = osdjfsdf
    }
}