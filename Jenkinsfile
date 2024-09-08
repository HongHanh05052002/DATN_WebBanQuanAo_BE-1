node {
  stage('checkout') {
          checkout scm
      }
      stage('check java') {
          bat "java -version"
      }

      stage('clean') {
          bat 'set "JAVA_HOME=C:\\Program Files\\Java\\jdk-17" && mvnw -ntp clean -P-webapp'
      }

      stage('package') {
          bat 'set "JAVA_HOME=C:\\Program Files\\Java\\jdk-17" && mvnw package'
      }

      stage('check image') {
              bat 'docker rm -f atino-backend || echo "this container does not exist" '
              bat 'docker image rm -f atino-be-backend || echo "this image dose not exist" '
          }
          stage('run') {
              bat "docker compose up -d --build"
          }
}