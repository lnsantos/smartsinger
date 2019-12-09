package com.donpeno.smartsinger.main.mvvm.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.donpeno.smartsinger.R
import com.donpeno.smartsinger.main.mvvm.fragments.AboutFragment
import com.donpeno.smartsinger.main.mvvm.fragments.AlbumFragment
import com.donpeno.smartsinger.main.mvvm.fragments.HomeFragment
import com.donpeno.smartsinger.main.mvvm.fragments.MusicFragment

public class AdapterPagesMainActivity(
    ctx: Context, fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    var titles = arrayListOf(
        ctx.getString(R.string.title_label_home),
        ctx.getString(R.string.title_label_album),
        ctx.getString(R.string.title_label_music),
        ctx.getString(R.string.title_label_about))
    
    override fun getItem(position: Int): Fragment = when (position) {
            onFragmentOptions.album ->  AlbumFragment()
            onFragmentOptions.music ->  MusicFragment()
            onFragmentOptions.about ->  AboutFragment()
            else -> HomeFragment()
        }

    override fun getCount(): Int = 4

    override fun getPageTitle(position: Int): CharSequence? = titles.get(position)

    object onFragmentOptions {
        var home : Int = 0
        var album: Int = 1
        var music: Int = 2
        var about: Int = 3
    }

}