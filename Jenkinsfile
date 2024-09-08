node {
  stage("Clone project") {
    git branch: 'main', url: 'https://github.com/Dai-Trinh/DATN_WebBanQuanAo_BE.git'
  }

  stage("Build project with test execution") {
    sh "./gradlew build"
  }
}