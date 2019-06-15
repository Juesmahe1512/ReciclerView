package co.com.dju.pruebas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcList.layoutManager = GridLayoutManager(this,1)

        val itemsShop = (0..5).map {
            ItemLanding("Titulo $it","Dos $it")
        }

        val adapter = AdapterItem(itemsShop)
        rcList.adapter = adapter
    }
}
