//package com.example.instagram
//
//import android.os.AsyncTask
//import android.os.SystemClock
//import android.widget.ProgressBar
//
//
//
//class DelayTask : AsyncTask<Void?, Int?, String>() {
//
//
////
//
//    var count = 0
//    override fun onPreExecute() {
//        pb.setVisibility(ProgressBar.VISIBLE)
//    }
//
//    protected override fun doInBackground(vararg p0: Void?): String? {
//        while (count < 5) {
//            SystemClock.sleep(1000)
//            count++
//            publishProgress(count * 20)
//        }
//        return "Complete"
//    }
//
//    protected override fun onProgressUpdate(vararg values: Int?) {
//        pb.setProgress(values[0])
//    }
//}