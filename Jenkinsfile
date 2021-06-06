pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven {
                    sh 'mvn clean compile'
                }

                echo "1111111111111111111111111111"


            }
        }

        stage ('Testing Stage') {

            steps {

                echo "2222222222222222222222222"

            }
        }


        stage ('Deployment Stage') {
            steps {

                echo "33333333333333333333333"

            }
        }
    }
}