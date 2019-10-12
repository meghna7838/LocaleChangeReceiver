package meghna.com.online_datastorage

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class LocaleChangedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
      Log.d("RCV","LOCALE")
        Toast.makeText(context,"LANGUAGE CHANGED",Toast.LENGTH_SHORT).show()
        context.startActivity(Intent(context,MainActivity::class.java))

    }
}
