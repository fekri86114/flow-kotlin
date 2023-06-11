package info.fekri.flow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import info.fekri.flow.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = MainViewModel(MainRepository())

        viewModel.dataStudents.observe(this) {
            Log.v("TEST_FLOW_MAIN_LOG", it.name)
        }

//        lifecycleScope.launch {
//            viewModel.dataStudents.collect {
//                Log.v("TEST_FLOW_MAIN_LOG", it.name)
//            }
//        }

    }
}