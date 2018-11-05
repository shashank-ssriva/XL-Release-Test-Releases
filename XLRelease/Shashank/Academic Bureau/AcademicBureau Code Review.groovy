// Exported from:        https://shashank-mbp.xebiaindia.local:5516/#/templates/Folder72a7359cf7bb4b44a36330317d925cf8-Folder4472fd7a7b0f4cf287407483eef74347-Releaseb43585cf80de49bf9734298f9243362e/releasefile
// XL Release version:   8.2.0
// Date created:         Mon Nov 05 08:17:05 IST 2018

xlr {
  template('AcademicBureau Code Review') {
    folder('Shashank/Academic Bureau')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-07-05T09:00:00+0530')
    scriptUsername 'admin'
    scriptUserPassword '{b64}YFKOzMTEICsqFJ592l2FbQ=='
    phases {
      phase('New Phase') {
        tasks {
          notification('Notification Task') {
            
          }
          custom('Code Quality Gate') {
            script {
              type 'sonar.checkCompliance'
              
            }
          }
        }
      }
    }
    
  }
}