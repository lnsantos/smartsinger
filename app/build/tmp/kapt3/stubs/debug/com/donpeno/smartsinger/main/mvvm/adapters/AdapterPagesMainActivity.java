package com.donpeno.smartsinger.main.mvvm.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/donpeno/smartsinger/main/mvvm/adapters/AdapterPagesMainActivity;", "Landroidx/fragment/app/FragmentPagerAdapter;", "ctx", "Landroid/content/Context;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "titles", "Ljava/util/ArrayList;", "", "getTitles", "()Ljava/util/ArrayList;", "setTitles", "(Ljava/util/ArrayList;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "onFragmentOptions", "app_debug"})
public final class AdapterPagesMainActivity extends androidx.fragment.app.FragmentPagerAdapter {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> titles;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    public AdapterPagesMainActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/donpeno/smartsinger/main/mvvm/adapters/AdapterPagesMainActivity$onFragmentOptions;", "", "()V", "about", "", "getAbout", "()I", "setAbout", "(I)V", "album", "getAlbum", "setAlbum", "home", "getHome", "setHome", "music", "getMusic", "setMusic", "app_debug"})
    public static final class onFragmentOptions {
        private static int home;
        private static int album;
        private static int music;
        private static int about;
        public static final com.donpeno.smartsinger.main.mvvm.adapters.AdapterPagesMainActivity.onFragmentOptions INSTANCE = null;
        
        public final int getHome() {
            return 0;
        }
        
        public final void setHome(int p0) {
        }
        
        public final int getAlbum() {
            return 0;
        }
        
        public final void setAlbum(int p0) {
        }
        
        public final int getMusic() {
            return 0;
        }
        
        public final void setMusic(int p0) {
        }
        
        public final int getAbout() {
            return 0;
        }
        
        public final void setAbout(int p0) {
        }
        
        private onFragmentOptions() {
            super();
        }
    }
}