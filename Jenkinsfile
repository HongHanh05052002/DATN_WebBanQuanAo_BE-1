pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Cấu hình để lấy code từ repository
                git branch: 'main',
                    url: 'https://github.com/Dai-Trinh/DATN_WebBanQuanAo_BE.git',
            }
        }
        stage('Build') {
            steps {
                // Ví dụ chạy build bằng Maven
                sh 'mvn clean install'
            }
        }
    }
}