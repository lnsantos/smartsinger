package com.donpeno.smartsinger.core.orm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/donpeno/smartsinger/core/orm/BaseDAO;", "D", "", "create", "", "schema", "(Ljava/lang/Object;)V", "delete", "getAll", "", "getAllById", "id", "", "app_debug"})
public abstract interface BaseDAO<D extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<D> getAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<D> getAllById(@org.jetbrains.annotations.NotNull()
    int[] id);
    
    public abstract void create(D schema);
    
    public abstract void delete(D schema);
}