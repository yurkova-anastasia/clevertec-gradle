package ru.clevertec.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import ru.clevertec.task.CustomTask

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def map = [description: 'something task', group: 'ru.clevertec', type: DefaultTask]
        project.task(map, "taskInCustomPlugin") {
            doFirst {
                println "taskInCustomPlugin has started to run"
            }
            doLast {
                println "taskInCustomPlugin is finished"
            }
            finalizedBy 'hello'
        }
        project.tasks.register('hello', CustomTask) {
            userName = project.rootProject.userName
            file = new File("$project.projectDir/gradle.build")
        }
    }
}
