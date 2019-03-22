package com.bairkhanpally.bairkhanpallyapp.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.app.ActivityCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bairkhanpally.bairkhanpallyapp.R
import com.bairkhanpally.bairkhanpallyapp.fragments.*
import com.google.android.gms.appinvite.AppInviteInvitation
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.app_bar_menu.*

class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        nav_view.setCheckedItem(R.id.nav_about)
        var fragment = ManaCharitraFragment();
        supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_about -> {
                // Handle the camera action
                var fragment = ManaCharitraFragment();
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
            R.id.nav_gallery -> {
                var fragment = GalleryFragment();
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
            R.id.nav_prajalu_upadi -> {
                var fragment = PrajaluUpaadiFragment();
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
            R.id.nav_weather -> {
                var fragment = BougolikaVivaraaluFragment()
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
            R.id.nav_contacts -> {
                var fragment = KeyContactsFragment();
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
            R.id.nav_send -> {
                var fragment = SuggestionsFragment();
                supportFragmentManager.beginTransaction().replace(R.id.content_layout, fragment).commit()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

//    private val REQUEST_INVITE: Intent = null

    private fun onInviteClicked() {
//        var intent = AppInviteInvitation.IntentBuilder(getString(R.string.invitation_title))
//            .setMessage(getString(R.string.invitation_message))
//            .setDeepLink(Uri.parse(getString(R.string.invitation_deep_link)))
//            .setCustomImage(Uri.parse(getString(R.string.invitation_custom_image)))
//            .setCallToActionText(getString(R.string.invitation_cta))
//            .build()
//        ActivityCompat.startActivityForResult(intent, REQUEST_INVITE)
    }
}
