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
}