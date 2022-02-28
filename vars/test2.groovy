def call(name){
    node {
        def mvnHome
        stage('Build') { 
            echo "${name} hello from shared lib 2"
        }
    }
}
