.class public interface abstract Lcom/tenjin/android/store/QueueEventDao;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract delete(Lcom/tenjin/android/store/QueueEvent;)V
.end method

.method public abstract deleteAllEvents()V
.end method

.method public abstract deleteOldEvents(Ljava/util/Date;)V
.end method

.method public abstract getAllEvents(Ljava/util/Date;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")",
            "Ljava/util/List<",
            "Lcom/tenjin/android/store/QueueEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getEventsFromParams(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tenjin/android/store/QueueEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/tenjin/android/store/QueueEvent;)J
.end method
