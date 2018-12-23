##基于springboot与gradle的多模块构建案例

    测试用例:

    1. 启动WEB模块下面的bootRun
       bootRun
    
    2. 测试
        http://127.0.0.1:8081/test1
        http://127.0.0.1:8081/test2/5/2

##gradle编译脚本需要重新下载gradle问题
    使用gradlew来build项目时，总是需要下载gradle-2.8-all.zip。但是gradle-2.8-all.zip非常大，有60MB左右，而服务器又在国外，因此经常各种下载失败。
    
    从本地安装的方法如下：
    
    先下载gradle-2.8-all.zip包。
    把下载好的zip包放到{project.dir}\gradle\wrapper目录下（也就是跟gradle-wrapper.properties 同一个目录）修改{project.dir}\gradle\wrapper\gradle-wrapper.properties文件。如下：
    
    #Wed Apr 10 15:27:10 PDT 2013
    distributionBase=GRADLE_USER_HOME
    distributionPath=wrapper/dists
    zipStoreBase=GRADLE_USER_HOME
    zipStorePath=wrapper/dists
    #distributionUrl=https\://services.gradle.org/distributions/gradle-2.8-all.zip
    distributionUrl=gradle-2.8-all.zip
    然后就运行gradlew build就行了。
    安装好gradle之后把gradle-wrapper.properties改回来就行了


