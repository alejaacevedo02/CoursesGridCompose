package com.example.coursesgridcompose.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CourseTopic(
    @StringRes val nameId: Int,
    val associatedCourses: Int,
    @DrawableRes val imageId: Int
)
