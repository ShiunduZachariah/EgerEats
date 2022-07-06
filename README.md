# EgerEats
Android Food Ordering and Delivery Application.
To Clone Repository
Open the Project in your android studio
IMPORTANT:- Change the PackageName
Create Firebase project.
Connect Firebase with Android Studio.
Download the file google-service.json from firebase project setting and import into your project
IMPORTANT FOR NOTIFICATION:- Copy Server key from Firebase/Project Setting/cloudmessaging/ and paste it in APIService.java class
After Registering as delivery person , copy UID of that delivery person from firebase and in :app/ChefFoodPanel/ChefPreparedOrderView.java" file at line 65=> String deliveryId = "oCpc4SwLVFbKO0fPdtp4R6bmDmI3"; paste here. Similarly, Do this in DeliveryPendingOrderFragment.java file
