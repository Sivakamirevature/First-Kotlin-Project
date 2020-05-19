package com.example.firstkotilinproject

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()
    init{
        initializeCourses()

    }
    fun initializeCourses(){
        var course = CourseInfo("17MCA001", "Course1")
        courses.set(course.courseId, course)

        course = CourseInfo("17MCA002", "Course2")
        courses.set(course.courseId, course)

        course = CourseInfo("17MCA003", "Course3")
        courses.set(course.courseId, course)



    }

}