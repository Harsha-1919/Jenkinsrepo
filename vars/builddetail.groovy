def call (String jobname){
   echo " this is the called function for getting email, login user and current job name"
    
    //    echo 'Print Build number and current login username'
		
//*		wrap([$class: 'BuildUser']) {
//                    diplay_build_user(BUILD_USER)
//                    display_node_name(NODE_NAME)  */
       
            echo "BUILD_NUMBER AS BELOW "
            println "Build number is ${currentBuild.number}"
	    echo "support email ${var_email}"
	   echo " Username is ${env.USER}"
	   echo "Username using build user is ${USER}"
	   echo "The job : ${JOB_NAME} run on ${NODE_NAME}"
	// echo "BUILD_TRIGGER_BY: ${BUILD_TRIGGER_BY}"
        
    
       //    }
        
    }
