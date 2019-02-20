pipeline {
    agent any



    stages {

        stage('api'){
          steps{
            script{
            sh"curl  -i http://${ENV}-api-${STACK}.turvo.com/health"
            }
          }
        }
        
        stage('event'){
          steps{
            script{
            sh'curl  -i http://-event-${STACK}.turvo.net/health'
            }
          }
        }
        stage('track'){
          steps{
            script{
            sh'curl  -i  http://${ENV}-track-${STACK}.turvo.com/health'
            }
          }
        }

        stage('orders'){
          steps{
            script{
            sh'curl  -i http://${ENV}-orders-${STACK}.turvo.com/health'
            }
          }
        }

        stage('items'){
          steps{
            script{
            sh'curl  -i http://${ENV}-items-${STACK}.turvo.com/health'
            }
          }
        }
        stage('contracts'){
          steps{
            script{
            sh'curl  -i http://${ENV}-contracts-${STACK}.turvo.com/health'
            }
          }
        }
        stage('unity'){
          steps{
            script{
            sh'curl  -i http://${ENV}-unity-${STACK}.turvo.com/health'
            }
          }
        }
        stage('presence'){
          steps{
            script{
            sh'curl  -i http://${ENV}-presence-${STACK}.turvo.com/health'
            }
          }
        }
        stage('notify'){
          steps{
            script{
            sh'curl  -i http://${ENV}-notify-${STACK}.turvo.net/health'
            }
          }
        }
        stage('core'){
          steps{
            script{
            sh'curl  -i http://${ENV}-core-${STACK}.turvo.net/health'
            }
          }
        }
        stage('http'){
          steps{
            script{
            sh'curl  -i http://${ENV}-http-${STACK}.turvo.com/health'
            }
          }
        }
        stage('edi'){
          steps{
            script{
            sh'curl  -i  http://${ENV}-edi-${STACK}.turvo.net/edi/info'
            }
          }
        }
        stage('bdi'){
          steps{
            script{
            sh'curl  -i  http://${ENV}-bdi-${STACK}.turvo.net//bdi/1/test'
            }
          }
        }
    }
}
