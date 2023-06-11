package info.fekri.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainRepository {

    fun randomStudent(): Student {
        val id = (1..1000).random()
        return Student(
            id = id,
            name = "Student$id",
            lastName = "familyName$id",
            fatherName = "fatherName$id",
            university = "Sharif",
            grade = "grade$id",
            sitePassword = "$id && $id",
            siteUserName = "$id"
        )
    }

    fun getAllFromApi(): Flow<Student> = flow {
        while (true) {
            emit(randomStudent())
            delay(2000)
        }
    }


}