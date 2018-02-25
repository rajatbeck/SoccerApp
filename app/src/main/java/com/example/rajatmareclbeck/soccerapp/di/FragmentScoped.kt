package com.example.rajatmareclbeck.soccerapp.di

import java.lang.annotation.ElementType
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.TYPE,
        AnnotationTarget.CLASS,
        AnnotationTarget.FILE,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER)
annotation class FragmentScoped