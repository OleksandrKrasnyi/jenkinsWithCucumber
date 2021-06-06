pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {

                echo "1111111111111111111111111111"
                mvn compile

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