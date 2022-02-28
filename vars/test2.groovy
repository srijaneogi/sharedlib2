def call(name){
    node {
        def mvnHome
        stage('Build') { 
            echo "${name} hello from github shared library 2 "
        }
    }
}
