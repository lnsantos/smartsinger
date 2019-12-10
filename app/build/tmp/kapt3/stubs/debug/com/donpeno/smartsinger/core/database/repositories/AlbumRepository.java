package com.donpeno.smartsinger.core.database.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/donpeno/smartsinger/core/database/repositories/AlbumRepository;", "", "database", "Lcom/donpeno/smartsinger/core/database/AppDatabase;", "(Lcom/donpeno/smartsinger/core/database/AppDatabase;)V", "dao", "Lcom/donpeno/smartsinger/core/dao/AlbumDao;", "get", "", "Lcom/donpeno/smartsinger/core/domain/Album;", "save", "", "album", "app_debug"})
public final class AlbumRepository {
    private final com.donpeno.smartsinger.core.dao.AlbumDao dao = null;
    
    public final long save(@org.jetbrains.annotations.NotNull()
    com.donpeno.smartsinger.core.domain.Album album) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.donpeno.smartsinger.core.domain.Album> get() {
        return null;
    }
    
    public AlbumRepository(@org.jetbrains.annotations.NotNull()
    com.donpeno.smartsinger.core.database.AppDatabase database) {
        super();
    }
}