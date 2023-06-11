package info.fekri.flow

data class Student(
    val id: Int,
    val name: String,
    val lastName : String,
    val fatherName: String,
    val university:String,
    val grade: String,
    val sitePassword: String,
    val siteUserName: String
)

data class StudentUi(
    val id: Int,
    val name: String,
    val lastName : String,
    val grade: String
)