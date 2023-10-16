package ru.clevertec.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class CustomTask extends DefaultTask {
    @Input
    String userName
    @OutputFile
    File file

    @TaskAction
    void greet() {
        println "Hello, $userName!"
    }

}
