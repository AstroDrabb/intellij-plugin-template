package com.github.astrodrabb.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.astrodrabb.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
