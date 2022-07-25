def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeployment(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: 'bdc997f0-20fd-4058-a0b6-f5b404b678ec', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}
def newTest
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}


  
