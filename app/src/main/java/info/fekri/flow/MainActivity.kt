package info.fekri.flow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import info.fekri.flow.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = MainViewModel(MainRepository())
        val testStateFlow = MutableStateFlow(-1)

        lifecycleScope.launch {
            testStateFlow.collect {
                Log.v("testFlow", it.toString())
            }
        }

        testStateFlow.value = 5
        testStateFlow.value = 3
        testStateFlow.value = 90

    }
}