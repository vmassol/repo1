import hudson.FilePath;

script {
        sh 'env > env.txt'
        String[] envs = readFile('env.txt').split("\r?\n")

        for(String vars: envs){
            println(vars)
        }
    }

