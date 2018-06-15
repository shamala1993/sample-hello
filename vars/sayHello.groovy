#!/usr/bin/env groovy

def call(String ID = 'My_Credentials', String P = 'PASSWORD', String U = 'USER') {
  withCredentials([usernamePassword(credentialsId: "${ID}", passwordVariable: "${P}", usernameVariable: "${U}")]) {
}
}


