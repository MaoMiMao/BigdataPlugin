package com.github.maomimao.bigdataplugin.services

import com.intellij.openapi.project.Project
import com.github.maomimao.bigdataplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
