def call (String mavenGoal){

  if("${mavenGoal}" =="clean")
  {
    sh "mvn clean "
  }
  else if ("${mavenGoal}" =="Compile")
  {
    sh "mvn clean compile"
  }
  else if ("${mavenGoal}" =="Test")
  {
    sh "mvn clean test"
  }
else if ("${mavenGoal}" =="package")
{
  sh "mvn clean package"
}
  
}
