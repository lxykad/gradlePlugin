package com.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {

        int count

        // 这里的 myplugin 和 app的gradle文件里配置领域名相同
        def extension = project.extensions.create("myplugin", MyExtension)

        project.task("testPlugin").doLast {
            //  print "test plugin=======1====" + extension.message

        }

        //  print "test plugin===========2==" + all


        project.plugins.all {
            switch (it) {



                default:
                    print "test plugin===========it==" + it.getClass().getSimpleName()
                    break
            }

        }



    }

    private String getPackageName() {

        return "packagename"
    }
}
