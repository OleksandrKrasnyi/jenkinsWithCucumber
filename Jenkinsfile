pipeline {
    agent any

    stages {

        stage ('Compile Stage') {

            steps {

                withMaven() {
                    sh 'mvn clean install'
                }
            }
        }

        stage ('Test Stage') {

            steps {

                withMaven() {
                    sh 'mvn test'
                }
            }
        }

        stage ('Cucumber Reports Stage') {

            steps {

                cucumber {
                    cucumber buildStatus: "UNSTABLE",
                        fileIncludePattern: "**/cucumber.json",
                        jsonReportDirectory: "target"
                }
            }
        }
    }
}