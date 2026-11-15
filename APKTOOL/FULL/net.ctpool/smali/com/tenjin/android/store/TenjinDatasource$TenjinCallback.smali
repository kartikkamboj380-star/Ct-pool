.class public interface abstract Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/store/TenjinDatasource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TenjinCallback"
.end annotation


# virtual methods
.method public abstract onEventsLoaded(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tenjin/android/store/QueueEvent;",
            ">;)V"
        }
    .end annotation
.end method
