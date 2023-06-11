package info.fekri.flow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class MainViewModel(mainRepo: MainRepository) {

    val dataStudents: Flow<StudentUi> = mainRepo.getAllFromApi()
            .map {
                StudentUi(it.id, it.name, it.lastName, it.grade)
            }
            .filter {
                it.name.endsWith('7')
            }
            .catch {
                Log.v("TEST_FLOW_LOG", it.message ?: "null message")
            }

}