package com.example.paypalimpementationexperiment

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.paypalimpementationexperiment.ui.theme.PayPalImpementationExperimentTheme
import com.paypal.paypalretailsdk.RetailSDK
import com.paypal.paypalretailsdk.RetailSDK.AppState


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // implementing first step from:
        // https://developer.paypal.com/docs/archive/paypal-here/sdk-dev/native/
        // App builds and runs without error, but screen is blank
        RetailSDK.initialize(this, object : AppState {
            /**
             * The integrating App should return an activity on which the SDK will launch it's UI elements like card reader finder, payment processing alerts
             */
            override fun getCurrentActivity(): Activity {
                // Return an activity for SDK UI
                return this@MainActivity
            }

            override fun getIsTabletMode(): Boolean {
                // return True for tablet mode
                return false // hardcoding for POC purposes only
            }
        })



        /*
        Auto-gen content from Android Studio
         */
//        setContent {
//            PayPalImpementationExperimentTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
    }
}

/*
 Android Studio auto-gen code
 */
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    PayPalImpementationExperimentTheme {
//        Greeting("Android")
//    }
//}
