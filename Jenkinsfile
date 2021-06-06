pipeline {
    agent any

    stage{
        stage ("Compile Stage") {

            steps {
                withMaven(maven: '3.8.1') {
                    sh 'mvn clean compile'
                }
            }

        }

        stage ("Testing Stage") {
            steps {
                    withMaven(maven: '3.8.1') {
                        sh 'mvn test'
                    }
            }
        }

        stage ("Deployment Stage") {
            steps {
                    withMaven(maven: '3.8.1') {
                        sh 'mvn deploy'
                }
            }
        }
    }
}