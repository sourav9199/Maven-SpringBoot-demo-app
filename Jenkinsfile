pipeline {
    agent any
    stages {
        stage("validate") {
            steps {
                 sh "mvn validate"
            }
        }
        stage("fresh build"){
             steps {
                sh "mvn clean install"
            }
        }
    }
}